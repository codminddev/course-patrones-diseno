package patrones.proxy.facotry;

import patrones.proxy.impl.IProcessEjecutor;
import patrones.proxy.impl.ProcessEjecutorProxy;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class ServiceFactory {
    public static IProcessEjecutor createProcessEjecutor(){
        return new ProcessEjecutorProxy();
    }
}
