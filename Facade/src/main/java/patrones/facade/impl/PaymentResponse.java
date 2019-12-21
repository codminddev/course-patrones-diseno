package patrones.facade.impl;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class PaymentResponse {
    private String confirmNumber;
    private double newBalance;
    private String newStatus;

    public PaymentResponse(String confirmNumber, double newBalance, String newStatus) {
        this.confirmNumber = confirmNumber;
        this.newBalance = newBalance;
        this.newStatus = newStatus;
    }
    
    

    public String getConfirmNumber() {
        return confirmNumber;
    }

    public void setConfirmNumber(String confirmNumber) {
        this.confirmNumber = confirmNumber;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }
    
    
}
