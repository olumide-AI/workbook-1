import java.util.Scanner;

public class ExtraMiniStringBuilderExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder nameBuilder = new StringBuilder();
        System.out.println("What is your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("What is your last name: ");
        String lastName = scanner.nextLine();

        nameBuilder.append(firstName).append(" ").append(lastName);
        System.out.println("Your full name is: " + nameBuilder);

        System.out.println("Reverse: " + reverseWord(firstName));
    }
    public static String reverseWord(String word){
        StringBuilder reverseString = new StringBuilder(word);
        return reverseString.reverse().toString();
    }
}
