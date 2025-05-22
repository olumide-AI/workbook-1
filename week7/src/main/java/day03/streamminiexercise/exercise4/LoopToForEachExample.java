package day03.streamminiexercise.exercise4;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "ba", "car", "dada", "kolawole", "potter", "afolabi", "nichelle", "olumide");
        stringList.forEach(System.out::println);
    }
    public static void regularWay(){
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
