public class GstCalculator {
  long GstAmount;
    public long calculateGst(long originalCost, int GstRateParc ,int quantity){
    if(GstRateParc > 0) {
     return (GstAmount = (((originalCost * quantity) * GstRateParc) / 100));
    }
    else{
     return  originalCost * quantity;
    }
    }

    public static  void main(String arg[]){

        GstCalculator obj = new GstCalculator();
        System.out.println("1. GST Amount for Furniture : 2 chairs of 2500/- = "+ obj.calculateGst( 2500,5, 2) );
        System.out.println("2. GST Amount for Food 5 kg of sugar 100/- kg  = "+ obj.calculateGst( 100,0,5) );
    }
}
