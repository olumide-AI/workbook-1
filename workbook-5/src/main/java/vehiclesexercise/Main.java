package vehiclesexercise;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("TOT", "1", 2020,112);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.getModel()+slowRide.getMake() + " color is " + slowRide.getColor());

        SemiTruck stanTruck = new SemiTruck("FreightLiner", "Stan-version", 2015, 1023);
        stanTruck.setCargoCapacity(2000);
        System.out.println( + stanTruck.getCargoCapacity() + " cubic feet wide. ");
    }

}
