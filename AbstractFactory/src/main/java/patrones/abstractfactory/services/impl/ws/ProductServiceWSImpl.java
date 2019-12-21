package patrones.abstractfactory.services.impl.ws;

import patrones.abstractfactory.services.IProductService;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class ProductServiceWSImpl implements IProductService{

    @Override
    public String[] getProducts() {
        System.out.println("ProductServiceWSImpl.getProducts => ");
        String[] results = new String[]{"Product 1", "Product 2"};
        return results;
    }
    
}
