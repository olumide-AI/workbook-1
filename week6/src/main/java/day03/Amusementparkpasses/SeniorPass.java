package day03.Amusementparkpasses;

public class SeniorPass extends Pass {
    public static final double SENIOR_DISCOUNT = 0.30;
    public SeniorPass(String holderName, double basePrice) {
        super(holderName, basePrice);
    }
    public double calculateFinalPrice(){
        return getBasePrice() - (getBasePrice() * SENIOR_DISCOUNT);
    }
}
