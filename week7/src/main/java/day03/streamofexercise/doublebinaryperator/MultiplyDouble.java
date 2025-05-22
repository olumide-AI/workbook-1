package day03.streamofexercise.doublebinaryperator;

import java.util.function.DoubleBinaryOperator;

public class MultiplyDouble {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 3.2;

        DoubleBinaryOperator doubleBinaryOperator = (x,y) -> x*y;

        System.out.println( doubleBinaryOperator.applyAsDouble(a,b));

    }
}
