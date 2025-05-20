package financeapplication;

public abstract class FixedAsset implements Valuable{
    private String name;
    private double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = marketValue;
    }
    //From the interface
    public double getValue(){
        return marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public String toString() {
        return name + " ($" + marketValue + ")";
    }
}
