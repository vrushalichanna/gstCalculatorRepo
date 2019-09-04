public class GSTCalculator {
    long GstAmount;


    public long calculateAmount(long originalCost, int GstRateParc ,int quantity){
        if(GstRateParc > 0) {
            return (GstAmount = (((originalCost * quantity) * GstRateParc) / 100));
        }
        else
            return originalCost * quantity;
    }

}
