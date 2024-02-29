import com.es2.factorymethod.FactoryProduct;
import com.es2.factorymethod.Product;
import com.es2.factorymethod.UndefinedProductException;

public class Main {
    public static void main(String[] args) throws UndefinedProductException {
        Product computer = FactoryProduct.makeProduct("Computer");
        Product software = FactoryProduct.makeProduct("Software");

        computer.setBrand("Hp");
        computer.getBrand();

        software.setBrand("IBM SPSS");
        software.getBrand();
    }
}
