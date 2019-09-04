public class Food {

    private int quantity;
    private double productPrice, tax, discountAmount;
    static double totalFood;

    //    ProductCategory category = ProductCategory.FOOD;
    public Food(int quantity, double productPrice) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.gstTaxCalculator();
    }

    public Food() {
    }

    public double gstTaxCalculator() {
        TaxSlab taxSlab = new TaxSlab();
        String category = "FOOD";
        tax = taxSlab.getFoodTax();
        totalFood += ((productPrice * quantity) + (tax * (productPrice * quantity)));
        if (totalFood >= 1000) {
            discountAmount = (totalFood * 0.10);
            System.out.println("Total Discount Amount of Food = " + discountAmount);
            discountAmount = discountAmount + totalFood;


        } else {
            System.out.println("Total Food Amount =" + totalFood);
            return totalFood;
        }

        return discountAmount;

    }

}
