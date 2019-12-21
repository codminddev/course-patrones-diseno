package patrones.adapter.impl;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public interface IBankAdapter {
    public BankCreditResponse sendCreditRequest(BankCreditRequest request);
}
