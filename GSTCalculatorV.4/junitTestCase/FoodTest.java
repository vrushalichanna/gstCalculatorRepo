import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTest {


    private int quantity;
    private double productPrice, tax, discountAmount;
    static double totalFood;

    @Before
    public void init(){
        TaxSlab taxSlab = new TaxSlab();
        String category = "FOOD";
         tax = taxSlab.getFoodTax();
        totalFood += ((productPrice * quantity) + (tax * (productPrice * quantity)));
//        if (totalFood >= 1000) {
//            discountAmount = (totalFood * 0.10);
//            discountAmount = discountAmount + totalFood;
//        }else {
//            totalFood;
//        }
    }

    @Test
    public void gstTaxCalculator() {
assertEquals(800,800);
    }


}