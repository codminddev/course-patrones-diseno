package patrones.singleton;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Configuration {
    
    private static Configuration config;
    
    private String appName;
    private String appVersion;
    private String dateFormat;
    private String currencyDate;
    
    private Configuration(){
        try {
            InputStream stream = Configuration.class.getClassLoader().getResourceAsStream("META-INF/config.properties");
            Properties props = new Properties();
            props.load(stream);
            this.appName = props.getProperty("appName");
            this.appVersion = props.getProperty("appVersion");
            this.dateFormat = props.getProperty("dateFormat");
            this.currencyDate = props.getProperty("currencyDate");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Configuration getInstance(){
        if(config == null){
            config = new Configuration();
        }
        return config;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getCurrencyDate() {
        return currencyDate;
    }

    public void setCurrencyDate(String currencyDate) {
        this.currencyDate = currencyDate;
    }
    
    
}
