package main.java.exercises.mod2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
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

    }
}
