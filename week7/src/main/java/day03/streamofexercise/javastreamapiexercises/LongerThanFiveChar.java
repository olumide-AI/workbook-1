package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class LongerThanFiveChar {
    public static void main(String[] args) {
        List<String> phrases = List.of("Hello", "World", "Functional", "Programming", "Java");
        long results = phrases.stream()
                .filter((n)-> n.length() > 5)
                .count();

        System.out.println(results);
    }


}
