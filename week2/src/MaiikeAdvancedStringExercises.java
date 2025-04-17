import java.util.Scanner;

public class MaiikeAdvancedStringExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name:");
        String name = scanner.nextLine();

        String greeting = greetFormally(name);
        System.out.println(greeting);
        scanner.close();
    }
    public static String greetFormally(String userName){
        return "Hello, Ms./Mr." + userName;
    }

}
