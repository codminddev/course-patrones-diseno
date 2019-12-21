package factorymethod.factory;

import java.sql.Connection;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public interface IDBAdapter {
    
    public Connection getConnection();
}
