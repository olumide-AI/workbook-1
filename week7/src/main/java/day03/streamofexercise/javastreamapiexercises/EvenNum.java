package day03.streamofexercise.javastreamapiexercises;

import java.util.List;

public class EvenNum {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 7, 10, 13, 16);

        List<Integer> evens = values.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evens);
    }
}
