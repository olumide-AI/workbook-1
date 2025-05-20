package day01.paymentprocessing;

public class Freelancer implements Payable{
    private final double FIXED_PRICE = 100;
    private int numHrs;

    public Freelancer(int numHrs) {
        this.numHrs = numHrs;
    }

    @Override
    public double getPaymentAmount() {
         final double OVERTIME_HOURS_PAY = 200;
         double overtimeHrs = 0;
        if(numHrs < 0){
            System.out.println("Didnt' worke any hours ");
            return 0;
        }
        if (numHrs < 40){
            return FIXED_PRICE * numHrs;
        }
        else{
            overtimeHrs = numHrs - 40;
            return (overtimeHrs * OVERTIME_HOURS_PAY) + (40 * FIXED_PRICE);
        }
    }
}
