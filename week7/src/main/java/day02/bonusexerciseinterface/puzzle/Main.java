package day02.bonusexerciseinterface.puzzle;

public class Main {
    public static void main(String[] args) {
        Speaker dog = new Dog();
        Speaker cat = new Cat();
        Speaker mimic = new Parrot(dog);
        Speaker randomMimic = new RandomParrot(dog);

        System.out.println("Dog says: " + dog.speak());
        System.out.println("Cat says: " + cat.speak());
        System.out.println("Parrot mimics dog: " + mimic.speak());
        System.out.println("Random parrot mimics: " + randomMimic.speak());
    }
}
