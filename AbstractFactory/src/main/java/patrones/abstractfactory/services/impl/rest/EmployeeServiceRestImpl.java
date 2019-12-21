package patrones.abstractfactory.services.impl.rest;

import patrones.abstractfactory.services.IEmployeeService;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class EmployeeServiceRestImpl implements IEmployeeService{

    @Override
    public String[] getEmployee() {
        System.out.println("EmployeeServiceRestImpl.getEmployee => ");
        String[] results = new String[]{"Employee1 ", "Employee 2"};
        return results;
    }
    
}
