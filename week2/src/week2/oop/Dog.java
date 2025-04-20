package week2.oop;

public class Dog {
    // Creating fields
    static int noOfEyes = 2;
    static String latinName = "Canis lupus familiaris";
    String name;
    String color;
    String breed;
    int age;
    int noOfLegs;

    public void bark() {
        System.out.println(name + " says: Woof! (Breed: " + breed + ")");
    }
}
