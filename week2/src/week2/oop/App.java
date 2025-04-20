package week2.oop;

public class App {
    public static void main(String[] args) {
        Cat johnny = new Cat();
        Dog sophia = new Dog();

        sophia.name = "Sophia";
        sophia.breed = "German Shepred";
        sophia.age = 2;
        johnny.age = 6;
        johnny.isFluffy = true;

        sophia.bark();

        //Make a Barking bulldog
        Dog bulldog = new Dog();
        bulldog.name = "John";
        bulldog.age = 1;
        bulldog.bark();

        // Create and set up a Cat
        Cat cat1 = new Cat();
        cat1.name = "Whiskers";
        cat1.age = 3;
        cat1.color = "Gray";
        cat1.meow();
        cat1.sleep();

        // Create and set up a Dog
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.age = 5;
        dog1.breed = "Bulldog";
        dog1.bark();
        dog1.wagTail();

        System.out.println(dog1.name);
        // Referencing
        //No new dog will be created, both variables share the same dog
        Dog dog2 = dog1;
        dog2.name = "Rex";
        dog2.bark();
        dog1.bark(); // dog1 now also barks as "Rex"

        System.out.println(dog1.name); //dog1 name is now rex here because of referencinf
    }
}
