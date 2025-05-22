package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class StringsToUppercase {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda");

        List<String> upperWords = words.stream()
                .map((s) -> s.toUpperCase())
                .toList();
        System.out.println(upperWords);
    }
}
