package day01.feedingtime;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Eater> eaters = new ArrayList<>();
        Dog dog = new Dog("jojo");
        Cat cat = new Cat("titi");

        eaters.add(dog);
        eaters.add(cat);

        for (Eater eater: eaters){
            eater.eat();
        }
    }


}
