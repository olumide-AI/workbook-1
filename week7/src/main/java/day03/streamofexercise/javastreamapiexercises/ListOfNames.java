package day03.streamofexercise.javastreamapiexercises;

import java.util.List;
//List<String> names = List.of("Alice", "Bob", "Charlotte", "Dan");

public class ListOfNames {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlotte", "Dan");

        List<Integer> results = names.stream()
                .map(n -> n.length())
                .toList();

        for (int i=0; i < names.size(); i++){
            System.out.println(names.get(i) + ":" + results.get(i));
        }
        //System.out.println(results);
    }
}
