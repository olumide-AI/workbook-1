package day03.interfaceminiexercise.stringformatinterface;

public class LambdaExample {
    public static void main(String[] args) {
        StringFormatter stringFormatter = (s) -> s.toUpperCase();
        System.out.println(stringFormatter.format("jojo"));
    }
}
