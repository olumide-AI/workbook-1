package day03.streamofexercise.builtinfunctionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a>b ? a : b;
        // if (a > b){
        // return a;
        //else b
        //BONUS: Use BinaryOperator<Integer> to find the max of two numbers Test with pairs like (10, 20), (5, 3).

        System.out.println(binaryOperator.apply(10,20));
    }
}
