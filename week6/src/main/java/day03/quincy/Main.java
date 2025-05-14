package day03.quincy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Animal> animalList = new ArrayList<>();
      //animalList.add(new Animal("john", 10));
      animalList.add(new Cat("robo", 3));
      animalList.add(new Dog("JOJO", 6));

      for (Animal animal: animalList){
          animal.eat();
      }

    }




}
