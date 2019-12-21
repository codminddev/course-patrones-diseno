package patrones.facade.impl;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public interface IPaymentFacade {
    public PaymentResponse pay(PaymentRequest request)throws PaymentException; 
}
