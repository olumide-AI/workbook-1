package assetmanager;

public class House extends Asset{
    private String address;
    private int condition; // 1=excellent, 2=good, 3=fair, 4=poor
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double valuePerSqFt;
        switch (condition) {
            case 1: valuePerSqFt = 180.00; break;
            case 2: valuePerSqFt = 130.00; break;
            case 3: valuePerSqFt = 90.00;  break;
            case 4: valuePerSqFt = 80.00;  break;
            default: valuePerSqFt = 100.00;
        }
        return (squareFoot * valuePerSqFt) + (lotSize * 0.25);
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", condition=" + condition +
                ", squareFoot=" + squareFoot +
                ", lotSize=" + lotSize +
                '}';
    }
}
