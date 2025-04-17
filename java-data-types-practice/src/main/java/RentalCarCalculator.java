import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        //Set Scanner Class
        Scanner scanner = new Scanner(System.in);

        //Date of service
        String serviceDate = pickDate(scanner);

        //toll tag
        String tollTag = tollTagNeeded(scanner);

        //gps
        String gpsNeeded = gpsNeeded(scanner);

        //roadside assistance needed
        String roadsideAssNeeded = roadsideAssNeeded(scanner);

        //Number of days renting car
        int noOfDays = noOfDaysNeeded(scanner);

        //scanner close
        scanner.close();

    }
    //Ask user for dates
    public static String pickDate(Scanner scanner){
        System.out.println("what date do you need your rental car service ex. mm-dd-yyyy");
        return  scanner.nextLine();
    }
    //Ask do they want an electronic toll tag
    public static String tollTagNeeded(Scanner scanner){
        System.out.println("Would you like an electronic toll tag with your rental. It's an additional $3.95/day (yes/no)");
        return scanner.nextLine();
    }

    //Ask do they need a GPS for $2.95 /day
    public static String gpsNeeded(Scanner scanner){
        System.out.println("Would you like an GPS with your rental. It's an additional $2.95/day (yes/no)");
        return scanner.nextLine();
    }

    //Ask if they want roadside assistance
    public static String roadsideAssNeeded(Scanner scanner){
        System.out.println("Would you like roadside assistance  with your rental. It's an additional $3.95/day (yes/no)");
        return scanner.nextLine();
    }

    //Ask user of number of days needed
    public static int noOfDaysNeeded(Scanner scanner){
        System.out.println("How many days would you be renting for ex 12 for 12 days");
        return scanner.nextInt();
    }

    //Logic and Calculations
    public static void carRentalCalc(int driverAge, ){
        double basicCarRental = 29.99;
        if driverAge
    }

}

