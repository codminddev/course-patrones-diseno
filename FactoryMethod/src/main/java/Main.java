
import entitys.Product;
import factorymethod.dao.ProductDAO;
import factorymethod.types.DBType;
import java.util.List;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        
        Product product1 = new Product(3l, "Producto 2", 30);
        
        ProductDAO dao = new ProductDAO();
        //dao.saveProduct(product1);
        
        List<Product> allProducts = dao.getAllProducts();
        for(Product current : allProducts){
            System.out.println(current);
        }
        
        
    }
}
