package day03.Amusementparkpasses;

public class ChildPass extends Pass{
    private static final double CHILDREN_DISCOUNT = 0.50;
    public ChildPass(String holderName, double basePrice) {
        super(holderName, basePrice);
    }
    public double calculateFinalPrice(){
        return getBasePrice() - (getBasePrice()*CHILDREN_DISCOUNT);
    }
}
