package patrones.facade.impl;

import java.util.HashMap;
import java.util.Map;
import patrones.facade.subsystems.bank.BankSystem;
import patrones.facade.subsystems.bank.TransferRequest;
import patrones.facade.subsystems.biller.BillingPayRequest;
import patrones.facade.subsystems.biller.BillingSystem;
import patrones.facade.subsystems.crm.CRMSystem;
import patrones.facade.subsystems.email.EmailSystem;
import patrones.facade.util.Customer;
import patrones.facade.util.OnMemoryDataBase;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class PaymentFacadeImpl implements IPaymentFacade{

    private BankSystem bankSystem = new BankSystem();
    private BillingSystem billingSystem = new BillingSystem();
    private CRMSystem crmSystem = new CRMSystem();
    private EmailSystem emailSystem = new EmailSystem();
    
    @Override
    public PaymentResponse pay(PaymentRequest request) throws PaymentException {
        try {
            
            Customer customer = crmSystem.findCustomer(request.getCustomerId());
            if(customer == null){
                throw new PaymentException("Cliente no existe");
            }else if(customer.getStatus().equals("Baja")){
                throw new PaymentException("El cliente esta dado de baja");
            }
            
            TransferRequest bankRequest = new TransferRequest(
                request.getAmmount(), 
                request.getCardNumber(), 
                request.getCardName(), 
                request.getCardExpDate(), 
                request.getCardSecureNumber());
            String payRefence = bankSystem.transfer(bankRequest);
            
            BillingPayRequest billingRequest = new BillingPayRequest(request.getCustomerId(), request.getAmmount());
            double newBalance = billingSystem.pay(billingRequest);
            
            String newStatus = customer.getStatus();
            if(newBalance <= 50){
                newStatus = "Activo";
                OnMemoryDataBase.changeCustomerStatus(request.getCustomerId(), newStatus);
            }
            Map<String, String> params = new HashMap<>();
            params.put("$name", customer.getName());
            params.put("$ammount", request.getAmmount()+"");
            params.put("$newBalance", newBalance+"");
            String number = request.getCardNumber();
            String subfix = number.substring(number.length()-4, number.length());
            params.put("$cardNumber", subfix);
            params.put("$reference", payRefence);
            params.put("$newStatus", newStatus);
            emailSystem.sendEmail(params);
            
            PaymentResponse response = new PaymentResponse(
                    payRefence,
                    newBalance,
                    newStatus);
            
            return response;
        } catch (Exception e) {
            throw new PaymentException(e.getMessage());
        }
    }
    
}
