package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class MatchOperate {
    public static void main(String[] args) {
        List<String> cities = List.of("Amsterdam", "Rotterdam", "Arnhem", "Delft", "Utrecht", "ab");
        boolean result =
        cities.stream()
                .allMatch((n) -> n.length() > 3);
        boolean result2 = cities.stream()
                .anyMatch((n) -> n.startsWith("A"));
        boolean result1 = cities.stream()
                .noneMatch((n) -> n.isEmpty());

        System.out.println(result2 );
    }
}
