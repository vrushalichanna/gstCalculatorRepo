import java.util.*;

public class Product {

    String productName;
    int quantity;
    double productPrice;

    HashMap<String, Double> foodCategory = new HashMap<>();
    HashMap<String, Double> furnitureCategory = new HashMap<>();
    HashMap<String, Double> electronicCategory = new HashMap<>();

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
        this.addCategoryOfProduct();
    }

    public void addCategoryOfProduct() {

        foodCategory.put("Rice", 150.0);
        foodCategory.put("Juice", 200.0);


        furnitureCategory.put("Sofa", 10000.0);
        furnitureCategory.put("Table", 5000.0);

        electronicCategory.put("Laptop", 40000.0);
        electronicCategory.put("Smartphone", 20000.0);

        HashMap<String, String> product = new HashMap<String, String>();

        product.put("FOOD", foodCategory.toString());
        product.put("FURNITURE", furnitureCategory.toString());
        product.put("ELECTRONICS", electronicCategory.toString());

        if (foodCategory.containsKey(productName)) {
            productPrice = foodCategory.get(productName);
            Food food = new Food(quantity, productPrice);
        } else if (furnitureCategory.containsKey(productName)) {
            productPrice = furnitureCategory.get(productName);
            Furniture furniture = new Furniture(quantity, productPrice);
        } else if (electronicCategory.containsKey(productName)) {
            productPrice = electronicCategory.get(productName);
            Electronics electronic = new Electronics(quantity, productPrice);
        } else {
            System.out.println("Not Available");
        }


    }


//    HashMap<String,Integer > productObj = new HashMap<String, Integer>();
////    GstTaxCalculator gstCalculator = new GstTaxCalculator();
//
//    public Product(String productName, int quantity) {
//        this.productName = productName;
//        this.quantity = quantity;
//        this.addCategoryOfProduct();
//    }
//    ProductCategory category=ProductCategory.FOOD ;
//
//   public void addCategoryOfProduct(){
//
//       if (category==ProductCategory.FOOD){
//         double taxRate = category.taxSlab();
//         productObj.put("Rice",150);
//         productObj.put("Juice",200);
//
//       }
//       else if(category==ProductCategory.FURNITURE){
//           productObj.put("Sofa",10000);
//           productObj.put("Table",5000);
//       }
//       else {
//           productObj.put("Laptop",40000);
//           productObj.put("Smartphone",20000);
//       }
//
//       HashMap<String, String> object = new HashMap<String, String>();
//
//           if (category==ProductCategory.FOOD && productObj.containsKey(productName)) {
//               productPrice = productObj.get(productName);
//               Food food = new Food(quantity, productPrice);
//           }
//           else if (category==ProductCategory.FURNITURE && productObj.containsKey(productName)) {
//               productPrice = productObj.get(productName);
//               Furniture furniture = new Furniture(quantity, productPrice);
//           }
//           else{
//               productPrice = productObj.get(productName);
//               Electronics electronic = new Electronics(quantity, productPrice);
//           }
//
//
//    }


}


