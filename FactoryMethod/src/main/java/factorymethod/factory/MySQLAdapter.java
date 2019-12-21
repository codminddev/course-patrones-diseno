package factorymethod.factory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class MySQLAdapter implements IDBAdapter{
    
    static{
        try {
            new com.mysql.jdbc.Driver();
        } catch (Exception e) {}
    }

    @Override
    public Connection getConnection() {
        try {
            String connectionString = getConnectionString();
            String user = "root";
            String password = "1234";
            Connection connection = DriverManager.getConnection(connectionString, user, password);
            System.out.println("Connection class => " + connection.getClass().getCanonicalName());
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    private String getConnectionString(){
        return "jdbc:mysql://localhost:3306/patterns?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
    }
}
