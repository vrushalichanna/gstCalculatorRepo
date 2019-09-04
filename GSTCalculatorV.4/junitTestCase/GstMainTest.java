import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GstMainTest {

    @Before
    public void init(){

    }

    @Test
    public void main() {

        ProductBasket productBasket = new ProductBasket();

        Product product = new Product("Rice", 5);
        productBasket.getBillDetails();

    }
}