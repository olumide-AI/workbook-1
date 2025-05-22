package day03.streamminiexercise.exercise2;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        //Create a new list of int
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Create new list
        long newList = integerList.stream()
                //Count the number of even number
                .filter((n) -> n%2 == 0)
                //Count is  terminal operation that returns a long
                .count();
        System.out.println("Even numbers count: " + newList);
    }
    public static void regularWay(){
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        int count = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0) { // check if even
                count++;
            }
        }

        System.out.println("Even numbers count: " + count);
    }
}
