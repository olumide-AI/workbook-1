import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateFormatterMaiikeExercise {
    //Following the step by step guide
    //Local date represent dates without time
    //DateTimeFormatter to format and parse date
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        //This convert strings into proper LocalDate object
        // It expects the string to be in yyyy-MM-dd format this is the ISO format,
        // which LocalDate.parse() understands by default.
        LocalDate date = LocalDate.parse(input);

        //Format Options for users
        System.out.println("Choose a format: ");
        System.out.println("Choose a format:");
        System.out.println("1 - dd MMMM yyyy (e.g. 17 April 2025)");
        System.out.println("2 - EEEE, MMM d, yyyy (e.g. Thursday, Apr 17, 2025)");
        System.out.println("3 - MM/dd/yyyy (e.g. 04/17/2025)");
        System.out.print("Your choice: ");
        String formatChoice = scanner.nextLine();

        //Logic for choosing new date format
        DateTimeFormatter formatter;

        if (formatChoice.equals("1")) {
            formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        } else if (formatChoice.equals("2")) {
            formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        } else if (formatChoice.equals("3")) {
            formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        } else {
            System.out.println("Invalid format choice.");
            return;
        }
        String formatted = date.format(formatter);
        System.out.println("Formatted date: " + formatted);
    }

}
