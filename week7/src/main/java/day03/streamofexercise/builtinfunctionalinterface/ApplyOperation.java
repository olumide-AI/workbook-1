package day03.streamofexercise.builtinfunctionalinterface;

import java.util.function.BiFunction;

public class ApplyOperation {

    //30. BONUS: Create a method applyOperation(int a, int b, BiFunction<Integer, Integer, Integer> operation) and
    // pass lambdas for add/subtract
    //
    //Call it like:
    //applyOperation(5, 3, (x, y) -> x + y);
    //applyOperation(10, 7, (x, y) -> x - y);


    public static void main(String[] args) {
        System.out.println(applyOperation(5, 3, (x, y) -> x + y));
        System.out.println(applyOperation(10, 7, (x, y) -> x - y));

    }
    public static int applyOperation(int a, int b, BiFunction<Integer, Integer, Integer> operation){
        return operation.apply(a,b);
    }
}
