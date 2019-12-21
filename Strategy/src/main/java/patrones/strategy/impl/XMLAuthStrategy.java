package patrones.strategy.impl;

import patrones.strategy.util.XMLUserUtil;

public class XMLAuthStrategy implements IAuthStrategy{

    @Override
    public Principal authenticate(String userName, String password) {
        String rol = XMLUserUtil.getRolByPrincipal(userName, password);
        
        if(rol.trim().isEmpty()){
            return null;
        }else{
            return new Principal(userName, rol);
            
        }
    }
    
}
