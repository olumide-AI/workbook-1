import java.util.Scanner;

public class SimpleCalculatorMaiikeExercise {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput = getUserData(scanner);
    double finalOperation = performOperation(userInput);
    disFinalOperation(userInput,finalOperation );

    }
    /*
        - Ask the user to enter two numbers
        num1
        num2
        - Ask the user for operations
        -Logic for operations
        if (user.equals("+")){
            return num1 + num2;
            }
        else if (user.equals("-"){
            return num1 - num2;
            }
        else if (user.equals("*"){
            return  (num1 * num2);
            }
        else if (user.equals("/"){
            return num1/num2);
            }
       else{
            return "not a valid operation";
            }
     */
    public static String getUserData(Scanner scanner){
        System.out.println("Enter 2 numbers with an operation (+,*,-or/) you would like to compute e.g (2 * 3)");
        System.out.println("Don't ignore the space... Thank you!!!! ");
        return scanner.nextLine().trim();
    }
    //Split string to compute calc
    public static double performOperation(String userInput){
        String[] splitParts = userInput.split(" ");
        if (splitParts.length > 3){
            System.out.println("We can't compute this operation please follow instructions");
            throw new ArithmeticException("too much variable and operations");
        }
        //Split string into 3 parts
        String firstPart = splitParts[0];
        String operation = splitParts[1];
        String lastPart = splitParts[2];

        //convert string to numbers for operations
        double firstNum = Double.parseDouble(firstPart);
        double secondNum = Double.parseDouble(lastPart);

        //Set rules for Operations
        //double finalOperation = 0;
        if (operation.equals("+")) {
            double finalOperation = firstNum + secondNum;
            return finalOperation;
        } else if (operation.equals("-")) {
            double finalOperation =  firstNum - secondNum;
            return finalOperation;
        } else if (operation.equals("*")) {
            double finalOperation =  firstNum * secondNum;
            return finalOperation;
        }
        else if (operation.equals("/")){
            if (secondNum == 0){
                System.out.println("Can't divide by 0");
            }
            else{
                double finalOperation =  firstNum/secondNum;
                return finalOperation;
            }

        }
        throw new ArithmeticException("Outside of my scope");



    }
    public static void disFinalOperation(String userData, double operationPerformed){
        System.out.println("your final operation " + userData + " is " + operationPerformed);
    }
}
