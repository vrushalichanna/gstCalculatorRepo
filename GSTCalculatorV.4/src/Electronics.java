public class Electronics {

    private int quantity;
    private double productPrice, tax, discountAmount;
    static double totalElectronicsAmount;

    public Electronics() {
    }

    public Electronics(int quantity, double productPrice) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.gstTaxCalculator();
    }

    public double gstTaxCalculator() {

        TaxSlab taxSlab = new TaxSlab();
        String category = "ELECTRONICS";
        tax = taxSlab.getFoodTax();
        totalElectronicsAmount += ((productPrice * quantity) + (tax * (productPrice * quantity)));
        if (totalElectronicsAmount >= 1000) {
            discountAmount = (totalElectronicsAmount * 0.10);
            System.out.println("Total Discount Amount of Electronics = " + discountAmount);
            discountAmount = discountAmount + totalElectronicsAmount;
        } else {
            System.out.println("Total Electronics Amount = " + totalElectronicsAmount);
            return totalElectronicsAmount;
        }
        return discountAmount;
    }


}
