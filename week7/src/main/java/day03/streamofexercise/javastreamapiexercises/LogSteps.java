package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class LogSteps {
    public static void main(String[] args) {
        List<String> items = List.of("Box", "Ball", "Book", "Bottle", "cat");

        List<String> result = items.stream()
                .filter((n) -> n.toLowerCase().startsWith("b"))
                .peek(n -> System.out.println("filtered: " + n))
                .map((n) -> n.toLowerCase())
                .peek((n)-> System.out.println("Mapped: " + n))
                .toList();
        System.out.println("Result: " + result);

    }
}
