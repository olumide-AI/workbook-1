package day03.streamofexercise.builtinfunctionalinterface;

import day03.interfaceminiexercise.generictypes.Predicate;

import java.util.List;

public class PredicatePractice {
    public static void main(String[] args) {
        List<String> data = List.of("Java", "", "Streams", "", "Fun");

        List<String> result = data.stream()
                .filter((n) -> !n.isEmpty())
                .toList();
        System.out.println("non empty string is: " + result);
    }
}
