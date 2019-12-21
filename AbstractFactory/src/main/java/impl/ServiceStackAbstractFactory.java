package impl;

import java.io.InputStream;
import java.util.Properties;
import patrones.abstractfactory.services.impl.rest.RestServiceStackImpl;
import patrones.abstractfactory.services.impl.ws.WSServiceStackImpl;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class ServiceStackAbstractFactory {
    
    private static final String CONFIG_PATH = "META-INF/abstractfactory.properties";
    
    public static IServiceStackAbstractFactory createServiceFactory(){
        try {
            Properties props = loadProperties();
            String concreteFactry = props.getProperty("defaultFamily");
            
            IServiceStackAbstractFactory factoryImpl = (IServiceStackAbstractFactory)Class.forName(concreteFactry).newInstance();
            return factoryImpl;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private static Properties loadProperties(){
        try {
            Properties p = new Properties();
            InputStream stream = ServiceStackAbstractFactory.class.getClassLoader().getResourceAsStream(CONFIG_PATH);
            p.load(stream);
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
