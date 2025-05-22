package day03.streamofexercise.javastreamapiexercises;

import java.util.Collections;
import java.util.List;

public class SortListDescendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 3, 9, 1, 8);
//        Collections.sort(numbers,(a,b)->b-a);
//        System.out.println(numbers);
        numbers.stream()
                .sorted((a,b)-> b-a)
                .forEach(i -> System.out.println(i) );
    }
}
