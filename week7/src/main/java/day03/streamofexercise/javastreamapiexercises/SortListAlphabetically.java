package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class SortListAlphabetically {
    public static void main(String[] args) {
        List<String> animals = List.of("Zebra", "Elephant", "Cat", "Dog", "Bear");

        animals.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
