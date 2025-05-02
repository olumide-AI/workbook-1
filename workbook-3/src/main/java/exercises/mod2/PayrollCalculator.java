package main.java.exercises.mod2;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        readFileFromCsv();
    }
    public static void readFileFromCsv(){
        //Load file using FileReader object
        try{
            //Create a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"));

            //Skips name header and discards the first line
            bufferedReader.readLine();

            String input;
            while ((input = bufferedReader.readLine()) != null){
                //System.out.println(input +"\n");

                //Split into individual files using | delimeter
                String[] splitParts = input.split("\\|");

                if (splitParts.length != 4){
                    System.out.println("skip line: " + input);
                    continue;
                }
                int id = Integer.parseInt(splitParts[0]);
                String name = splitParts[1];
                double hoursWorked = Double.parseDouble(splitParts[2]);
                double payRate = Double.parseDouble(splitParts[3]);

                //Copy the values from the tokens array into variables that
                // match the data and then use them to create a new Employee object
                Employee employee = new Employee(name, id, hoursWorked, payRate);

                //Display the employee using a printf and by calling the employee's
                // getEmployeeId(), getName(), and getGrossPay() methods
                System.out.printf("ID : %d Name: %s GrossPay: %.2f%n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
            bufferedReader.close();
        }
        catch (IOException e){
            System.out.println("File reading error");
        }
        catch (NumberFormatException e){
            System.out.println("Skipping line due to formatting error on line: ");
        }

    }

}
