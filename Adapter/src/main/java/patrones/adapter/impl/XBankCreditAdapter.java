package patrones.adapter.impl;

import patrones.adapter.creditapi.bankx.XBankCreditAPI;
import patrones.adapter.creditapi.bankx.XBankCreditRequest;
import patrones.adapter.creditapi.bankx.XBankCreditResponse;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class XBankCreditAdapter implements IBankAdapter {

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        XBankCreditAPI api = new XBankCreditAPI();
        
        XBankCreditRequest xrequest = new XBankCreditRequest();
        xrequest.setCustomerName(request.getCustomer());
        xrequest.setRequestAmount(request.getAmount());
        
        XBankCreditResponse xresponse = api.sendCreditRequest(xrequest);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(xresponse.isAproval());
        
        return response;
    }
    
}
