package usingintellij;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Customer me = new Customer(1, "Dana W.", 125.00f);

        System.out.println(me.toString());
        System.out.println(me);
    }
}
