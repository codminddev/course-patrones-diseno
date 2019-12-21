package patrones.abstractfactory.services.impl.ws;

import impl.IServiceStackAbstractFactory;
import patrones.abstractfactory.services.IEmployeeService;
import patrones.abstractfactory.services.IProductService;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class WSServiceStackImpl implements IServiceStackAbstractFactory{

    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceWSImpl();
    }

    @Override
    public IProductService getProductService() {
        return new ProductServiceWSImpl();
    }
    
}
