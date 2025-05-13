package assetmanager;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        double cost = getOriginalCost();
        int age = 2025 - year;

        if (age <= 3) {
            cost *= 0.97;
        } else if (age <= 6) {
            cost *= Math.pow(0.94, age - 3);
        } else if (age <= 10) {
            cost *= Math.pow(0.92, age - 6);
        } else {
            cost -= 1000.00;
        }

        if (odometer > 100000) {
            cost *= 0.75;
        }

        if (!(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            cost -= 1000;
        }

        return cost;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "makeModel='" + makeModel + '\'' +
                ", year=" + year +
                ", odometer=" + odometer +
                '}';
    }
}
