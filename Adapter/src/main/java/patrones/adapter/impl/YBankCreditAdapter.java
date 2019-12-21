package patrones.adapter.impl;

import patrones.adapter.creditapi.banky.YBankCreditApprove;
import patrones.adapter.creditapi.banky.YBankCreditApproveResult;
import patrones.adapter.creditapi.banky.YBankCreditSender;
import patrones.adapter.creditapi.banky.YBankCreditSenderListener;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class YBankCreditAdapter implements IBankAdapter, YBankCreditSenderListener{

    private YBankCreditApproveResult yresult;
    
    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        
        YBankCreditSender api = new YBankCreditSender();
        
        YBankCreditApprove yrequest = new YBankCreditApprove();
        yrequest.setCredit((float)request.getAmount());
        yrequest.setName(request.getCustomer());
        
        api.sendCreditForValidate(yrequest, this);
        
        do{
            try {
                Thread.sleep(10000);
                System.out.println("yBank whait for response");
            } catch (Exception e) {}
        }while(yresult == null);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(yresult.getApproved().equalsIgnoreCase("Y"));
        return response;
    }

    @Override
    public void notifyCreditResult(YBankCreditApproveResult result) {
        this.yresult = result;
    }
    
}
