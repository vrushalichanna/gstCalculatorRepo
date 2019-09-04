public class GstApplication {

    public static void printInfo(TaxCalcutor tax){
        System.out.println("Cost: " + tax.getPrice() + "; Ingredients: " + tax.gstPrcent()+"; Quantity " +tax.qauntity());
    }
    public static  void main( String arg[]){
//        GstCalculator food = new GstCalculator();
//        System.out.println(food.gstCalculator(2000,2,5));
//        Food f1 = new Food(TaxCalcutor new = )

        TaxCalcutor tax = new Food();
        printInfo(tax);
    }

}
