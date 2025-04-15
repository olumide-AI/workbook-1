import java.util.*;
public class UnderstandingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "What do you want to do (1-add, 2= subtract) ? ");
        int command = scanner.nextInt();
        if (command == 1) { doAdd(scanner);
        }
        else if (command == 2) {
            doSubtract(scanner); }
        else {
            System.out.printf(
                    "%d -- Invalid command!", command);
        }
    }
    public static void doAdd(Scanner scanner) { System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble(); System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.printf("%f + %f = %f", num1, num2, sum);
    }
    public static void doSubtract(Scanner scanner) {
        System.out.print("Enter 1st number: "); double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: "); double num2 = scanner.nextDouble();
        double difference = num1 - num2;
        System.out.printf(
                "%f - %f = %f", num1, num2, difference);
    }

}
