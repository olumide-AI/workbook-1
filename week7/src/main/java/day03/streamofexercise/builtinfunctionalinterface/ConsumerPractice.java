package day03.streamofexercise.builtinfunctionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world", "lambda");
        Consumer<String> uppercase = (n) -> System.out.println(n.toUpperCase());
        words.forEach(uppercase);
    }

}
