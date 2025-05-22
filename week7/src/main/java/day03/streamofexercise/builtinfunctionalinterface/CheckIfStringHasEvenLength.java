package day03.streamofexercise.builtinfunctionalinterface;

import java.util.function.Function;

public class CheckIfStringHasEvenLength {
    public static void main(String[] args) {
        //28. BONUS: Chain Function<String, Integer> and Function<Integer, Boolean>
        // to check if a string has even length
        //
        //Input: "Test" → true
        //Input: "Hello" → false
        Function<String, Integer> lengthFunc = (n) -> n.length();
        Function<Integer, Boolean> boolTest = (n) -> n%2 == 0;

        boolean result = boolTest.apply(lengthFunc.apply("maiike rocks"));
        System.out.println(result);
    }
}
