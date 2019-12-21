package patrones.composite;

import patrones.composite.pos.Order;
import patrones.composite.product.CompositeProduct;
import patrones.composite.product.SimpleProduct;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        SimpleProduct ram4gb = new SimpleProduct("Memoria RAM 4GB", 750, "KingStone");
        SimpleProduct ram8gb = new SimpleProduct("Memoria RAM 8GB", 1000, "KingStone");
        SimpleProduct disk500gb = new SimpleProduct("Disco Duro 500GB", 1500, "ACME");
        SimpleProduct disk1tb = new SimpleProduct("Disco Duro 1TB", 2000, "ACME");
        SimpleProduct cpuAMD = new SimpleProduct("AMD phenon", 4000, "AMD");
        SimpleProduct cpuIntel = new SimpleProduct("Intel i7", 4500, "Intel");
        SimpleProduct smallCabinete = new SimpleProduct("Gabinete Pequeno", 2000, "ExCom");
        SimpleProduct bigCabinete = new SimpleProduct("Gabinete Grande", 2200, "ExCom");
        SimpleProduct monitor20inch = new SimpleProduct("Monitor 20'", 1500, "HP");
        SimpleProduct monitor30inch = new SimpleProduct("Monitor 30'", 2000, "HP");
        SimpleProduct simpleMouse = new SimpleProduct("Raton Simple", 150, "Genius");
        SimpleProduct gammerMouse = new SimpleProduct("Raton Gammer", 750, "Alien");
        SimpleProduct keyboard = new SimpleProduct("keyboard", 100, "ACME");
        
        CompositeProduct keyboardAndMouse = new CompositeProduct("Keyboard Mouse", 0);
        keyboardAndMouse.addProduct(simpleMouse); //150
        keyboardAndMouse.addProduct(keyboard); // 100
        // 150 + 100 = 250
        
        
        
        
        
        
        
        
        CompositeProduct package1 = new CompositeProduct("Desktop PC", 0);
        package1.addProduct(ram4gb); //750
        package1.addProduct(disk500gb); //1500
        package1.addProduct(cpuIntel); //4500
        package1.addProduct(keyboardAndMouse);
        package1.addProduct(keyboardAndMouse);
        // 750 + 1500 + 4500 + (250)
        
        CompositeProduct package2 = new CompositeProduct("Gammer PC", 0);
        package2.addProduct(ram8gb);
        package2.addProduct(ram8gb);
        package2.addProduct(ram8gb);
        package2.addProduct(ram8gb);
        package2.addProduct(disk1tb);
        package2.addProduct(bigCabinete);
        package2.addProduct(monitor30inch);
        package2.addProduct(keyboardAndMouse);
        package2.addProduct(package1);
        
        Order order = new Order(1l, "Oscar Blancarte");
        order.addProduct(package2); 
        
        
        order.printOrder();
        
    }
}
