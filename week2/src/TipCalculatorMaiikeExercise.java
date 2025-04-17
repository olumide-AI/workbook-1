import java.util.Scanner;

public class TipCalculatorMaiikeExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double billAmount = billAmount(scanner);
        double tipPercent = tipPercentage(scanner);
        double noOfPeople = noOfPerson(scanner);
        double tipAmount = tipAmount(tipPercent, billAmount);
        double totalBill = totalBill(tipAmount,billAmount);
        double splitBill = splitBill(totalBill, noOfPeople);
        displayMessage(noOfPeople,totalBill,tipPercent);
    }
    /*
        Ask the user for a bill amount in double
        ask the user for desired tip percentage
        calc the tip amount
        calc the total bill = bill amount + tip amount
        round using math.ceil and math.floor
     */
    public static double billAmount(Scanner scanner){
        System.out.println("What is your bill amount");
        return scanner.nextDouble();
    }
    public static double tipPercentage(Scanner scanner){
        System.out.println("what is your intended tip %. Input 20 for 20%");
        return scanner.nextDouble();
    }
    public static int noOfPerson(Scanner scanner){
        System.out.println("How many people are paying today: ");
        return scanner.nextInt();
    }
    //Calculations
    public static double tipAmount(double userTipPercentage, double userTotalBill){
        //convert percentage to decimal
        double tipToDecimal = userTipPercentage/100;
        return tipToDecimal * userTotalBill;
    }
    public static double totalBill(double userTotalTipAmount, double userTotalBill){
        return userTotalBill + userTotalTipAmount;
    }
    public static double splitBill(double billAmount, double noOfPeople){
        return billAmount/noOfPeople;
    }

    //Display output using string formst  and print cheapstake message
    public static void displayMessage(double noOfPerson, double totalBill, double tipPercentage){
        System.out.printf("for a group of %.2f your total bill per person is %.2f", noOfPerson, totalBill);
        if (tipPercentage <= 10){
            System.out.println();
            System.out.println("Cheapskate alert");
        }
    }
}
