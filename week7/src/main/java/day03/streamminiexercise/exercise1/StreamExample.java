package day03.streamminiexercise.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        //Create a new list
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Use stream to filter out even numbers
        List<Integer> newList = integerList.stream()
                //filter out even num so keep odd num
                .filter((n) -> n % 2 != 0)
                //square the odd number
                .map((n) -> n*n)
                .toList();
        System.out.println(newList);
    }
    public static void regularWay(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) { // filter out even numbers
                int squared = number * number; // square the number
                result.add(squared); // add to result
            }
        }

        System.out.println(result); // [1, 9, 25, 49, 81]
    }
}
