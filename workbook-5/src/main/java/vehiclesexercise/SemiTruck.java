package vehiclesexercise;

public class SemiTruck extends Vehicle {
    public SemiTruck (String model, String make, int yearMade, int vinNumber){
        super(model, make, yearMade, vinNumber);
    }
    private int numberOfTrailers;
    private boolean hasSleeper;

}
