package com.ltca.week03.day01.constructor;

public class App2 {
    public static void main(String[] args) {
        //Create first book
        Book bookOne = new Book("the day of the boss", "Preston", 200);

        //Create second book
        Book bookTwo = new Book("Jesus has come", "John", 365);

        //Create third book
        Book bookThree = new Book("Love of family", "Rosario", 500);

        //Create book with no argument
        Book bookFour = new Book();

        //Call describe method
        bookOne.describe();
        bookTwo.describe();
        bookThree.describe();
        bookFour.describe();

        //Create one cupcake #7
        Cupcake cupcakeOne = new Cupcake("Vanilla", 500);
        cupcakeOne.isHealthy();

        //Create person class
        Person personOne = new Person("Lana", -5);

        //create planet class
        Planet earth = new Planet("Earth", 12742);
        System.out.println("Planet: " + earth.getName());
        // earth.name = "Mars"; ❌ This will give a compile error

        //Create car
        Car tesla = new Car("Tesla", 2021, true);
        Car dodge = new Car("Dodge", 2019, false);
        tesla.startEngine();
        dodge.startEngine();

        //Create room and house
        Room kitchen = new Room("kitchen");
        House houseOne = new House(kitchen);
        houseOne.describe();

        //Area of a rectangle
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(10, 3);

        System.out.println("Area 1: " + r1.getArea());
        System.out.println("Area 2: " + r2.getArea());
    }
}
