package day03.streamofexercise.builtinfunctionalinterface;

import java.util.function.BiFunction;

public class StringConcatenate {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction =  (a,c) -> a + "-" + c ;
        System.out.println(biFunction.apply("data", "science"));
    }
}
