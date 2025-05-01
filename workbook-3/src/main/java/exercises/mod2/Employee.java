package main.java.exercises.mod2;

public class Employee {
    private String name;
    private int employeeId;
    private double hoursWorked;
    private double payRate;

    public Employee(String name, int employeeId, double hoursWorked, double payRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void getGrossPay(){
        double payRate = getHoursWorked() * getPayRate();
    }
}
