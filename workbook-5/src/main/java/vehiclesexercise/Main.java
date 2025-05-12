package vehiclesexercise;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide + "color is " + slowRide.getColor());

        SemiTruck stanTruck = new SemiTruck();
        stanTruck.setCargoCapacity(2000);
        System.out.println( + stanTruck.getCargoCapacity() + " cubic feet wide. ");
    }

}
