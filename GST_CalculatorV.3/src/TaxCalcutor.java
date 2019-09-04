public interface TaxCalcutor {

//     double gstCalculator(double price ,int quantity ,int gstPrcent);
     double getPrice();
     int qauntity();
     int gstPrcent();
    double gstCalculator(double price, int quantity, int gstPrcent);


}
