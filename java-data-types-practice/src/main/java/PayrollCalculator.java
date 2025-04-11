import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        //Create a scanner object called input
        Scanner input = new Scanner(System.in);

        // Enter employee name
        System.out.println("Please enter your name: ");
        String userName = input.nextLine();

        //Enter hours worked a floating point number
        System.out.println("Please enter hours worked: ");
        double hoursWorked = input.nextDouble();
        input.nextLine();
        System.out.println();

        //Enter Pay rate
        System.out.println("Please the pay rate: ");
        double payRate = input.nextDouble();
        input.nextLine();
        System.out.println();

        // Calculate gross pay
        //double grossPay = hoursWorked * payRate;

        //Display Gross pay
        //System.out.println("Name is: " + userName + "and gross pay is: " + grossPay );

        //Optional Part
        double grossPay = 0.0;
        if (hoursWorked > 40){
            grossPay += (hoursWorked - 40) * payRate * 1.5;
            grossPay += 40 * payRate;
        }
        else{
            grossPay += hoursWorked * payRate;
        }
        System.out.println("Total pay after overtime for  " + userName + " is " + grossPay);

    }

}
