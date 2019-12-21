package patrones.composite.pos;

import java.util.ArrayList;
import java.util.List;
import patrones.composite.product.AbstractProduct;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Order {
    private long orderId;
    private String customer;
    private List<AbstractProduct> products;

    public Order(long orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    
    public void addProduct(AbstractProduct product){
        this.products.add(product);
    }
    
    public double getTotal(){
        double total = 0;
        for(AbstractProduct current : products){
            total += current.getPrice();
        }
        return total;
    }
    
    public void printOrder(){
        System.out.println("OrderID => " + this.orderId);
        System.out.println("Customer => " + this.customer);
        System.out.println("Products => ");
        
        for(AbstractProduct current : products){
            current.printOrder();
        }
        
        System.out.println("Total ==> " + this.getTotal());
    }
    
}
