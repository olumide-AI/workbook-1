import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //User Inputs
        String userName = getUserName(scanner);
        String dateOfArrival = dateOfArrival(scanner);
        int noOfTickets = noOfTickets(scanner);

        // new formats
        String newNameFormat = nameFormat(userName);
        String newDateFormat = dateFormatter(dateOfArrival);

        //display message
        displayMessage(noOfTickets,newDateFormat, newNameFormat);
    }
    /*
        Ask user to enter name using scanner property
        ask them for the date they will be coming in (mm/dd/yyyy) (String)
        how many ticket in int

        Format user full name to (lastname, firstname)
        Format date to yyyy/mm/dd

        logic
        if (noOfTickets) = 1{
        sout (noOfTickets + "ticket reserved for " + convert date + "under" + userInputFormmatted);
        }
        else{
        sout  noOfTickets + "tickets reserved for " + convert date + "under" + userInputFormmated);
     */
    public static String getUserName(Scanner scanner){
        System.out.println("Please enter your name: ");
        return scanner.nextLine().trim();
    }
    public static String dateOfArrival(Scanner scanner){
        System.out.println("What date will you be coming (MM/dd/yyyy):");
        return scanner.nextLine().trim();
    }
    public static int noOfTickets(Scanner scanner){
        System.out.println("How many tickets would you like?");
        return scanner.nextInt();
    }
    public static String nameFormat(String userName){
        String[] nameParts = userName.split(" ");
        if (nameParts.length >=2){
            return nameParts[1] + ", " + nameParts[0];
        }
        else{
            return userName;
        }
    }
    public static String dateFormatter(String dateOfArrival){
        DateTimeFormatter inputFORMAT = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateOfArrival, inputFORMAT);
        return date.format((outputFormat));
    }
    public static void displayMessage(int noOfTickets, String newDateFormat, String newNameFormat){
        if (noOfTickets == 1){
            System.out.println(noOfTickets + " ticket reserved for " + newDateFormat + " under " + newNameFormat);
        }
        else {
            System.out.println(noOfTickets + " tickets reserved for " + newDateFormat + " under " + newNameFormat);
        }
    }
}
