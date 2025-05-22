package day03.interfaceminiexercise.printerinterface;

public class LambdaDemo {
    public static void main(String[] args) {
        Printer printer = (x) -> System.out.println(x);
        printer.print("code wars");
    }
}
