package day03.interfaceminiexercise.generictypes;

import java.util.ArrayList;
import java.util.List;

public class LamdaDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = (x ) -> x.startsWith("a");
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("watermelon");
        stringList.add("angels");
        processString(predicate,stringList);

    }
    public static void processString(Predicate<String> stringPredicate, List<String> list){
        for (String item: list){
            if (stringPredicate.test(item)){
                System.out.println(item);
            }
        }
    }
}
