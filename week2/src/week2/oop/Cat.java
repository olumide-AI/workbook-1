package week2.oop;

public class Cat {
    //Creating fields
    static String latinName = "Felis catus";
    String color;
    String name;
    int age;
    int noOfLegs;
    boolean isFluffy;

    //Creating methods in class
    public void meow(){
        System.out.println(name + " says: Meow! (in a " + color + " coat)");
    }
}
