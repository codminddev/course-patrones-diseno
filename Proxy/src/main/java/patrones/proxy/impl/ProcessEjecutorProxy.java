package patrones.proxy.impl;

import patrones.proxy.services.AuditService;
import patrones.proxy.services.SecurityService;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class ProcessEjecutorProxy implements IProcessEjecutor{

    @Override
    public void ejecuteProcess(int idProcess, String user, String password) throws Exception {
        SecurityService security = new SecurityService();
        boolean authentica = security.authorization(user, password);
        if(!authentica){
            throw new Exception("Autorización denegada");
        }
        
        // paso previo 2
        
        DefaultProcessEjecutor process = new DefaultProcessEjecutor();
        process.ejecuteProcess(idProcess, user, password);
        
        AuditService audit = new AuditService();
        audit.auditServiceUsed(user, DefaultProcessEjecutor.class.getSimpleName());
        
        //paso posterior 2
    }
    
}
