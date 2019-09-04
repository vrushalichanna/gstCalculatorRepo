public abstract class GstCalculator implements  TaxCalcutor{
    double discountAmount;
    public double gstCalculator(double price, int quantity, int gstPrcent){
       double  GstAmount =  ((price * quantity ) * gstPrcent) / 100 ;
        double totalAmount =  price * quantity + GstAmount;
       if( totalAmount >= 1000){
           discountAmount  = totalAmount * 10/100;
       }
       else {
           return totalAmount;
       }
        return discountAmount;
    }
}
