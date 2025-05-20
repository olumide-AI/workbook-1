package day01.movable;

public class Bicycle implements Movable{
    String name;

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Moving Bike");
    }
}
