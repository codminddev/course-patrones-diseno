package patrones.adapter;

import patrones.adapter.impl.BankCreditRequest;
import patrones.adapter.impl.BankCreditResponse;
import patrones.adapter.impl.XBankCreditAdapter;
import patrones.adapter.impl.YBankCreditAdapter;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        BankCreditRequest request = new BankCreditRequest();
        request.setAmount(2000);
        request.setCustomer("Oscar Blancarte");
        
        XBankCreditAdapter xBank = new XBankCreditAdapter();
        BankCreditResponse xResponse = xBank.sendCreditRequest(request);
        System.out.println("XBank approval => " + xResponse.isApproved());
        
        YBankCreditAdapter yBank = new YBankCreditAdapter();
        BankCreditResponse yResponse = yBank.sendCreditRequest(request);
        System.out.println("YBank approval => " + yResponse.isApproved());
        
        
    }
}
