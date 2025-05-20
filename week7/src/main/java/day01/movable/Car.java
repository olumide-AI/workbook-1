package day01.movable;

public class Car implements Movable{
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Moving car");
    }
}
