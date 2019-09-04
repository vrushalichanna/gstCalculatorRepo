public class Food implements  TaxCalcutor{

//    @Override
//    public double gstCalculator(double price, int quantity, int gstPrcent) {
////        super.gstCalculator()+"2000","2","5";
//        return tax.gstCalculator(2000,2,0);
//    }


    @Override
    public double getPrice() {
        return 2000;
    }

    @Override
    public int qauntity() {
        return 2;
    }

    @Override
    public int gstPrcent() {
        return 0;
    }

    @Override
    public double gstCalculator(double price, int quantity, int gstPrcent) {
//        this.getPrice(),"20000";
        return 0;
    }


}
