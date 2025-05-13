package vehiclesexercise;

public class Vehicle {
    //Made up
    private String engineType;
    private int numberOfWheels;
    private int vinNumber;
    private int yearMade;
    private String model;
    private String make;
    private License license;
    private int odometer;
    private boolean running;
    //Compulsory
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    //Constructor

    public Vehicle(String model, String make, int yearMade, int vinNumber) {
        this.model = model;
        this.make = make;
        this.yearMade = yearMade;
        this.vinNumber = vinNumber;
    }


    //Getters and setters


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
