package day03.streamofexercise.stringaction;

public class Main {
    public static void main(String[] args) {
        StringAction stringAction = (a, b) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < b; i++) {
                result.append(a);
            }
            return result.toString();
        };

        System.out.println(stringAction.act("Hi", 3));
        System.out.println(stringAction.act("Yo", 5));
    }
}
