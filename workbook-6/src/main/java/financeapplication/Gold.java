package financeapplication;

public class Gold extends FixedAsset{

    private double weight;

    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Gold: " + getName() + ", " + weight + "kg ($" + getValue() + ")";
    }
}
