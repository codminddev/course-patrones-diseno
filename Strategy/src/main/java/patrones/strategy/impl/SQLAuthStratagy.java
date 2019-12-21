package patrones.strategy.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import patrones.strategy.util.MySQLDBAdapter;

public class SQLAuthStratagy implements IAuthStrategy{
    
    
    @Override
    public Principal authenticate(String userName, String password) {
        try {
            MySQLDBAdapter adapter = new MySQLDBAdapter();
            Connection connection = adapter.getConnection();

            String queryString = "SELECT userName,rol from users where userName='%s' and password = '%s'";
            String query = String.format(queryString, userName, password);

            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(query);
            if(results.next()){
                return new Principal(results.getString("userName"), results.getString("rol"));
                
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
}
