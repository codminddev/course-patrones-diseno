package patrones.facade;

import patrones.facade.impl.IPaymentFacade;
import patrones.facade.impl.PaymentFacadeImpl;
import patrones.facade.impl.PaymentRequest;
import patrones.facade.impl.PaymentResponse;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        try {
            IPaymentFacade facade = new PaymentFacadeImpl();
            
            PaymentRequest request =new PaymentRequest();
            request.setAmmount(500);
            request.setCardExpDate("10/2015");
            request.setCardName("Oscar Blancarte");
            request.setCardNumber("1234567890123456");
            request.setCardSecureNumber("345");
            request.setCustomerId(4L);
            
            PaymentResponse response = facade.pay(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
