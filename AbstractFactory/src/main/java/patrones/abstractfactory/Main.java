package patrones.abstractfactory;

import impl.IServiceStackAbstractFactory;
import impl.ServiceStackAbstractFactory;
import impl.ServiceType;
import patrones.abstractfactory.services.IEmployeeService;
import patrones.abstractfactory.services.IProductService;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        IServiceStackAbstractFactory factory = 
                ServiceStackAbstractFactory.createServiceFactory();
        
        IEmployeeService employeeService = factory.getEmployeeService();
        IProductService productService = factory.getProductService();
        
        String[] employee = employeeService.getEmployee();
        
        
        for(String current: employee){
            System.out.println(current);
        }
        
        String[] prodcuts = productService.getProducts();
        for(String current: prodcuts){
            System.out.println(current);
        }
    }
}
