package day03.streamminiexercise.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "ba", "car", "dada", "kolawole", "potter", "afolabi", "nichelle", "olumide");
        List<String> newList = stringList.stream()
                //filter out strings with less than 6 char
                .filter((n) -> n.length() >=6)
                //convert to uppercase
                .map(String::toUpperCase)
                //What does it mean lamda can be replaced with method refernce
                .toList();
        System.out.println(newList);
    }
    public static void regularWay(){
        List<String> words = Arrays.asList("hello", "world", "stream", "java", "filtering", "uppercase");
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 6) {
                result.add(word.toUpperCase());
            }
        }

        System.out.println(result);
    }
}
