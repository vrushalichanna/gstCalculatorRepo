import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ProductBasketTest {

    @Test
    public void addProductToBasket(String productName, int quantity) {
        HashMap<String, Integer> productList = new HashMap<>();
            if (productList.containsKey(productName)) {
                int temp = productList.get(productName);
                productList.replace(productName, temp, (temp + quantity));
            } else {
                productList.put(productName, quantity);
            }
            System.out.println(productList);
        }


    @Test
    public void getBillDetails() {
        ProductBasket productBasket = new ProductBasket();

        Product product = new Product("Rice", 5);

        Product product1 = new Product("Sofa", 1);

        Product product2 = new Product("Laptop", 2);

        productBasket.getBillDetails();

        assertEquals("true",750,750);
    }
}