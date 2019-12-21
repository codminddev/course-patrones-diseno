package patrones.strategy;

import patrones.strategy.impl.AuthProvider;
import patrones.strategy.impl.OnMemoryAuthStrategy;
import patrones.strategy.impl.Principal;
import patrones.strategy.impl.SQLAuthStratagy;
import patrones.strategy.impl.XMLAuthStrategy;

public class Main {
    public static void main(String[] args) {
        AuthProvider provider = new AuthProvider(new XMLAuthStrategy());
        
        String userName = "oblancarte";
        String password = "1234";
        
        Principal principal = provider.authenticate(userName, password);
        System.out.println(principal);
        
        
        provider.setAuthStrategy(new SQLAuthStratagy());
        principal = provider.authenticate(userName, password);
        System.out.println(principal);
        
        
        
    }
}
