package patrones.proxy;

import patrones.proxy.facotry.ServiceFactory;
import patrones.proxy.impl.IProcessEjecutor;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        IProcessEjecutor process = ServiceFactory.createProcessEjecutor();
        try {
            process.ejecuteProcess(1, "oblancarte", "12");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
