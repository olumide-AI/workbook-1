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

        //Age of customer
        int customerAge = customerAge(scanner);

        //Calculate and show rental cost
        carRentalCalc(customerAge, tollTag, gpsNeeded,roadsideAssNeeded, noOfDays);

        //Display result



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
    // Ask for their age
    public static int customerAge(Scanner scanner){
        System.out.println("How old are you? There's a 30% subcharge if you're under 25 years old");
        return scanner.nextInt();
    }

    //Ask user of number of days needed
    public static int noOfDaysNeeded(Scanner scanner){
        System.out.println("How many days would you be renting for ex 12 for 12 days");
        return scanner.nextInt();
    }

    //Logic and Calculations
    public static void carRentalCalc(int driverAge, String tollTag, String gpsPay, String roadsipePay, int noOfDays ){
        double baseRate = 29.99;
        double optionsCost = 0;
        double underageSubcharge = 0;

        if (tollTag.equalsIgnoreCase("yes")){
            optionsCost += 3.95 * noOfDays;
        }
        if (gpsPay.equalsIgnoreCase("yes")){
            optionsCost += 2.95 * noOfDays;
        }
        if (roadsipePay.equalsIgnoreCase("yes")){
            optionsCost += 3.95 * noOfDays;
        }

        //Base cost
        double basicCarRentalCost = baseRate * noOfDays;

        //underage drivers extra charge
        if (driverAge < 25){
            //Apply a 30% subcharge
            underageSubcharge = basicCarRentalCost * 0.30;
        }
        double total = basicCarRentalCost + optionsCost + underageSubcharge;

        displaySummary(basicCarRentalCost, optionsCost, underageSubcharge, total);

    }
    public static void displaySummary(double baseCost, double optionsCost, double surcharge, double total) {
        System.out.println("\nRental Summary:");
        System.out.printf("Base rental cost: $%,.2f%n", baseCost);
        System.out.printf("Options cost: $%,.2f%n", optionsCost);
        System.out.printf("Underage driver surcharge: $%,.2f%n", surcharge);
        System.out.printf("Total cost: $%,.2f%n", total);
    }


}

