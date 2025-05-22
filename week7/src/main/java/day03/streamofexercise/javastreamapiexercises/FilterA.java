package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class FilterA {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        List<String> result = words.stream()
                .filter((n) -> n.startsWith("A"))
                .toList();
        System.out.println(result);

    }
}
