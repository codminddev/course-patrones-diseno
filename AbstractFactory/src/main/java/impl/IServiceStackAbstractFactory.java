package impl;

import patrones.abstractfactory.services.IEmployeeService;
import patrones.abstractfactory.services.IProductService;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public interface IServiceStackAbstractFactory {
    public IEmployeeService getEmployeeService();
    public IProductService getProductService();
}
