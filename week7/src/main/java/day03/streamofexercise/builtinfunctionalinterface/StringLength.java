package day03.streamofexercise.builtinfunctionalinterface;

import java.util.List;
import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        List<String> names = List.of("Eve", "Charles", "Bob");
        Function<String, Integer> stringIntegerFunction = (s) -> s.length();

        List<Integer> newname = names.stream()
                .map(stringIntegerFunction)
                .toList();
        System.out.println("length: " + newname);

//        for(String name: names){
//            System.out.println(stringIntegerFunction.apply(name));
//        }

    }
}
