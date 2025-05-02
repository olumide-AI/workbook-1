package main.java.exercises.mod2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtendedPayrollCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the name of the file employee file to process: ");
        String employeeFilename = scanner.nextLine().trim();

        System.out.println("Enter the name of the payroll file to create: EX. payroll-sept-2023.csv ");
        String payrollFilename = scanner.nextLine().trim();

        List <Employee> employeeList = readEmployeesFromFile(employeeFilename);
        if (payrollFilename.toLowerCase().endsWith(".json")){
            writeToJsonFile(payrollFilename, employeeList);
        }
        else {
            writeToCsvFile(payrollFilename, employeeList);
        }
        System.out.println("Payroll export complete.");
    }
    public static List<Employee> readEmployeesFromFile(String filename){
        //Create new list of employees
        List <Employee> employees = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            //Skip header to avoid errors
            bufferedReader.readLine();

            String newline;
            while((newline = bufferedReader.readLine()) != null){
                String[] splitByPipes = newline.split("\\|");
                if (splitByPipes.length !=4){
                    System.out.println("Skip wrong format line: " + newline);
                    continue;
                }
                try{
                    int id = Integer.parseInt(splitByPipes[0].trim());
                    String name = splitByPipes[1].trim();
                    double hoursWorked = Double.parseDouble(splitByPipes[2].trim());
                    double payRate = Double.parseDouble(splitByPipes[3].trim());

                    employees.add(new Employee(name, id, hoursWorked, payRate));
                }
                catch (NumberFormatException e){
                    System.out.println("Please provide the right format in: " + newline);
                }
            }

        }
        catch (IOException e){
            System.out.println("Error reading file");
        }
        return  employees;
    }
    public static void writeToCsvFile(String filename, List<Employee> employees){
        try(FileWriter writer = new FileWriter(filename)){
            writer.write("id|name|gross pay\n");
            for (Employee employee : employees){
                writer.write(String.format("%d|%s|%.2f\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay()));
            }
        }
        catch (IOException e){
            System.out.println("Error Writing payroll csv:");
        }
    }
    public static void writeToJsonFile(String filename, List<Employee> employees){
        try(FileWriter writer = new FileWriter(filename)){
            writer.write("[\n");
            for (int i =0; i < employees.size(); i++){
                Employee employee = employees.get(i);
                writer.write(String.format(" {\"id\": %d, \"name\": \"%s\", \"grossPay\": %.2f} ", employee.getEmployeeId(), employee.getName(), employee.getGrossPay()));
                if (1 <employees.size() -1){
                    writer.write(",\n");
                }
                else{
                    writer.write("\n");
                }
            }
            writer.write("]");
        }
        catch (IOException e){
            System.out.println("Error writing payroll JSON ");
        }

    }

}
