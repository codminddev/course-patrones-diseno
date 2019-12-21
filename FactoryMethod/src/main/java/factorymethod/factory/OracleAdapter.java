package factorymethod.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class OracleAdapter implements IDBAdapter{

    static{
        try {
            new OracleDriver();
        } catch (Exception e) {}
    }
    
    
    @Override
    public Connection getConnection() {
        try {
            String urlConnection = getConnectionString();
            String user = "system";
            String password = "1234";
            Connection connection = DriverManager.getConnection(urlConnection, user, password);
            System.out.println("Connection class => " + connection.getClass().getCanonicalName());
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
    
    public String getConnectionString(){
        return "jdbc:oracle:thin:@localhost:1521:XE";
    }
    
    
}
