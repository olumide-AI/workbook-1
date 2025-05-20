package financeapplication;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    @Override
    public String toString() {
        return "Jewelry: " + getName() + ", " + karat + "K ($" + getValue() + ")";
    }
}
