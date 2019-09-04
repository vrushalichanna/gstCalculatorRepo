public class Furniture {

    private int quantity;
    private double productPrice, tax, discountAmount;
    static double totalFunitureAmount;

    public Furniture(int quantity, double productPrice) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.gstTaxCalculator();
    }

    public Furniture() {
    }

    public double gstTaxCalculator() {

        TaxSlab taxSlab = new TaxSlab();
        String category = "FURNITURE";
        tax = taxSlab.getFoodTax();
        totalFunitureAmount += ((productPrice * quantity) + (tax * (productPrice * quantity)));
        if (totalFunitureAmount >= 1000) {
            discountAmount = (totalFunitureAmount * 0.10);
            System.out.println("Total Discount Amount Of Furniture = " + discountAmount);
            discountAmount = discountAmount + totalFunitureAmount;
        } else {
            System.out.println("Total Furniture Amount = " + totalFunitureAmount);
            return totalFunitureAmount;
        }
        return discountAmount;
    }

}
