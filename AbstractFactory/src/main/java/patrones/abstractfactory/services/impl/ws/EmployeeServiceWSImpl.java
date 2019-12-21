package patrones.abstractfactory.services.impl.ws;

import patrones.abstractfactory.services.IEmployeeService;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class EmployeeServiceWSImpl implements IEmployeeService{

    @Override
    public String[] getEmployee() {
        System.out.println("EmployeeServiceWSImpl.getEmployee => ");
        String[] results = new String[]{"Employee1 ", "Employee 2"};
        return results;
    }
    
}
