package patrones.abstractfactory.services.impl.rest;

import impl.IServiceStackAbstractFactory;
import patrones.abstractfactory.services.IEmployeeService;
import patrones.abstractfactory.services.IProductService;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class RestServiceStackImpl implements IServiceStackAbstractFactory{

    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceRestImpl();
    }

    @Override
    public IProductService getProductService() {
        return new ProductServiceRestImpl();
    }
    
}
