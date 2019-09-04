
public class GSTMenu {

    public static void main(String arg[]) {

        GSTCalculator furniture = new GSTCalculator();
        GSTCalculator food = new GSTCalculator();
        System.out.println("1. GST Amount for Furniture : 3 chairs of 2500/- = " + furniture.calculateAmount(2000, 5, 4));
        System.out.println("2. GST Amount for Food 5 kg of sugar 100/- kg  = " + food.calculateAmount(100, 0, 5));
    }
}
