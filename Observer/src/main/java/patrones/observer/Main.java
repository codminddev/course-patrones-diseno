package patrones.observer;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
        
        ConfigurationManager managar = ConfigurationManager.getInstance();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        NumberFormat moneyFormat = new DecimalFormat("###,##0.00");
        
        
        
        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        managar.addObserver(a);
        managar.addObserver(b);
        
        managar.setDateFormat(dateFormat);
        managar.setMoneyFormat(moneyFormat);
        
        
        
        System.out.println("Fin");
    }
}
