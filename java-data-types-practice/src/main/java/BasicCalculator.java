import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Create two floating point numbers

        System.out.println("Enter the first number: ");
        double firstNum = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        System.out.println("Enter the second number: ");
        double secondNum = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        //Possible calculation we can do
        System.out.println("Possible calculations: Add, Subtract, Multiply, or Divide ");
        System.out.println("(A)dd: ");
        System.out.println("(S)ubtract: ");
        System.out.println("(M)ultiply: ");
        System.out.println("(D)ivide: ");

        // Ask operation

        System.out.println("Please select an option: ");
        String operation = scanner.nextLine();

        System.out.println("you've chosen " + operation);

        // Multiply and result
        double result = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + result);

        //Close Scanner
        scanner.close();



    }
}
