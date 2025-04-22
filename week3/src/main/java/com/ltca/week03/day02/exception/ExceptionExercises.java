package com.ltca.week03.day02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Divide two numbers with exception handling Ask the user for
        // two int numbers and divide them. Catch any exceptions.
//        try{
//            System.out.println("What's your first number");
//            int nrOne = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("What is your second number ");
//            int nrTwo = scanner.nextInt();
//            scanner.nextLine();
//
//            int result = nrOne/nrTwo;
//            System.out.println("your number divison is: " + result);
//        }
//        catch (InputMismatchException e){
//            System.out.println("Please provide an integer value only");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Don't divide by 0");
//        }
        // 2. String to int conversion Ask the user to input a number as a string.
        // Convert it with Integer.parseInt() and catch exceptions.
//        try {
//            System.out.println("Input a number as a sting: What is your number");
//            String strNumOne = scanner.nextLine();
//            int intNumOne = Integer.parseInt(strNumOne);
//            System.out.println(intNumOne);
//        }
//        catch (NumberFormatException e){
//            System.out.println("Please put in a string number");
//        }
        // 3. Get age input Ask the user to enter their age.
        // Repeat the question until they give a valid number.
        //  is a flag to control the loop — it starts as false and
        //  becomes true only when the user enters a correct number.
//        boolean flag = false;
//        int age = 0;
//        while (!flag){
//            System.out.println("How old are you: ");
//            try{
//                //Put the part that will throw an exception in the try
//                //if the user enters a valid number, we store it in age, and
//                // mark flag = true so the loop will stop.
//                age = scanner.nextInt();
//                flag = true;
//            }
//            catch (InputMismatchException e){
//                System.out.println("Invalid input. Please enter an correct number format");
//                scanner.nextLine();
//            }
//
//        }
//        // we only want to print it once, after the user has finally entered a valid number.
//        System.out.println("You're " + age + "years old.");
//
        // 4. Guess the number game with exception handling Ask the user to guess
        // a hardcoded number. Use exception handling to deal with wrong input types.

//
        // 5. Temperature converter Ask the user for a temperature in Celsius.
//        // Catch exceptions if input is not a number.
//        System.out.println("What is your temp in celsius");
//        try{
//            double tempCelsius = scanner.nextDouble();
//            double tempFah = (tempCelsius * ((double) 9 /5)) + 32;
//            System.out.println("Your temperature is now " + tempFah);
//        }
//        catch (InputMismatchException e){
//            System.out.println("Invalid input format");
//
//        }
        // 6.Even number checker Ask the user to enter a number. Print whether it’s even or odd. Repeat until valid input is given.
//        boolean validInput = false;
//
//        while (!validInput) {
//            System.out.print("Enter a number: ");
//
//            try {
//                int number = scanner.nextInt(); // Try to read an int
//
//                // Check if it's even or odd
//                if (number % 2 == 0) {
//                    System.out.println("That number is even.");
//                } else {
//                    System.out.println("That number is odd.");
//                }
//
//                validInput = true; // ✅ Success — end the loop
//
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter a whole number.");
//                scanner.nextLine(); // 🔥 Clear the invalid input
//            }
//        }

        // 7. Simple calculator with + - * / Ask the user for two numbers and an operator.
        // Handle invalid input and divide-by-zero.
//        boolean valid = false;
//
//        while (!valid) {
//            try {
//                // Get the first number
//                System.out.print("Enter the first number: ");
//                double num1 = scanner.nextDouble();
//
//                // Get the second number
//                System.out.print("Enter the second number: ");
//                double num2 = scanner.nextDouble();
//                scanner.nextLine();
//
//                // Get the operator
//                System.out.print("Enter an operator (+, -, *, /): ");
//                String operator = scanner.nextLine();
//
//                double result;
//
//                // Handle each operator with if-else
//                if (operator.equals("+")) {
//                    result = num1 + num2;
//                    System.out.println("Result: " + result);
//                    valid = true;
//                } else if (operator.equals("-")) {
//                    result = num1 - num2;
//                    System.out.println("Result: " + result);
//                    valid = true;
//                } else if (operator.equals("*")) {
//                    result = num1 * num2;
//                    System.out.println("Result: " + result);
//                    valid = true;
//                } else if (operator.equals("/")) {
//                    if (num2 == 0) {
//                        System.out.println("Error: Cannot divide by zero.");
//                    } else {
//                        result = num1 / num2;
//                        System.out.println("Result: " + result);
//                        valid = true;
//                    }
//                } else {
//                    System.out.println("Invalid operator. Please use +, -, *, or /.");
//                }
//
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter a number.");
//                scanner.nextLine(); // clear invalid input
//            }
//        }

        // 8. Read multiple numbers and add them Let the user input 3 numbers (one by one).
        // If one input fails, ask again for that number.
//        double sum = 0;
//        int count = 0;
//
//        while (count < 3) {
//            System.out.print("Enter number " + (count + 1) + ": ");
//            try {
//                double number = scanner.nextDouble();
//                sum += number;
//                count++; // only move to next when input is valid
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter a number.");
//                scanner.nextLine(); // clear the invalid input
//            }
//        }
//
//        System.out.println("Sum of the three numbers: " + sum);

        // 9. Username input with length check Ask for a username.
        // Throw a custom IllegalArgumentException if it’s shorter than 3 characters.
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        try {
            if (username.length() < 3) {
                throw new IllegalArgumentException("Username must be at least 3 characters long.");
            }

            System.out.println("Welcome, " + username + "!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();

    }
}
