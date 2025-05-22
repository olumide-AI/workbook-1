package day03.streamofexercise.greeter;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = (n) -> System.out.println("Hello " + n);
        greeter.greet("babe");
    }
}
