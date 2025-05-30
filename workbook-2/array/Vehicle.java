package array;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    //Constructors
    public Vehicle(int vehicleId, String makeModel, String color, int odometerReading, float price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color =color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    //setters and getters

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void display() {
        System.out.println(vehicleId + " - " + makeModel + " - " + color + " - " + odometerReading + " miles - $" + price);
    }

}
