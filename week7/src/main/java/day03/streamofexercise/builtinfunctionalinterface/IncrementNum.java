package day03.streamofexercise.builtinfunctionalinterface;

import java.util.function.UnaryOperator;

public class IncrementNum {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (n) -> n+1;


        System.out.println(unaryOperator.apply(6));
    }
}
