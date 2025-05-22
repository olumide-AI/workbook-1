package day03.interfaceminiexercise.unaryoperator;

public class LambdaDemo {
    public static void main(String[] args) {
        UnaryOperator unaryOperator = (x) -> x*x;
        System.out.println(unaryOperator.apply(-13));
    }
}
