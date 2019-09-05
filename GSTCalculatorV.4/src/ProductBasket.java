import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Spliterators;

public class ProductBasket {

    private String productName;
    private int quantity;
//    private double productPrice;

    HashMap<String, Integer> productList = new HashMap<>();

    public void addProductToBasket(String productName, int quantity) {
        if (productList.containsKey(productName)) {
            int temp = productList.get(productName);
            productList.replace(productName, temp, (temp + quantity));
        } else {
            productList.put(productName, quantity);
        }
        System.out.println(productList);
    }

    public double getBillDetails() {
        Food food = new Food();
        Furniture furniture = new Furniture();
        Electronics electronics = new Electronics();

        double totalFoodBill = food.gstTaxCalculator();
        System.out.println("Total Amount Of Food = " + totalFoodBill);

        double totalFurnitureBill = furniture.gstTaxCalculator();
        System.out.println("Total Amount Of Furniture = " + totalFurnitureBill);

        double totalElectronicsBill = electronics.gstTaxCalculator();
        System.out.println("Total Amount  of Electronics = " + totalElectronicsBill);
        return  totalFoodBill;
    }
}

