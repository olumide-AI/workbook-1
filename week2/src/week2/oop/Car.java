package week2.oop;

public class Car {
    String make;
    String model;
    int topSpeed;

    public void startEngine() {
        System.out.println("Vroom! The " + make + " " + model + " starts its engine.");
    }

    // Bonus method!
    public void honk() {
        System.out.println("The " + make + " honks loudly!");
    }
}
