package day03.interfaceminiexercise.functionalinterface;

public class LambdaExpression {
    public static void main(String[] args) {
        NumericOperator numericOperator = (a, b) -> a + b;
        System.out.println(numericOperator.operate(40, 50));

        NumericOperator numericOperator1 = (a, b) -> a>b ? a:b;
        System.out.println(numericOperator1.operate(100, 90));
    }
}
