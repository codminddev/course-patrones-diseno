package patrones.proxy.impl;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class DefaultProcessEjecutor implements IProcessEjecutor{

    @Override
    public void ejecuteProcess(int idProcess, String user, String password) throws Exception {
        System.out.println("Proceso ejecutado");
    }
    
}
