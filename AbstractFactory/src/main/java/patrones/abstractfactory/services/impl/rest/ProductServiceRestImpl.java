package patrones.abstractfactory.services.impl.rest;

import patrones.abstractfactory.services.IProductService;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class ProductServiceRestImpl implements IProductService {

    @Override
    public String[] getProducts() {
        System.out.println("ProductServiceRestImpl.getProducts => ");
        String[] results = new String[]{"Product 1", "Product 2"};
        return results;
    }
    
}
