package hoteloperations;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    //Variables for clocking in
    private double punchInTime;
    private double punchOutTime;

    //Constructor

    public Employee(double hoursWorked, double payRate, String department, String name, String employeeId) {
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.department = department;
        this.name = name;
        this.employeeId = employeeId;
    }

    //Generate Setters and getters

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //Methods
    public void punchIn(double time){
         punchInTime = time;

    }
    public void punchOut(double time){
        double timeWorked = Math.abs(time - punchInTime);
        hoursWorked += timeWorked;
    }

    //Methods using local date time
    public void punchIn(){
         punchInTime = LocalDateTime.now().getHour();
    }

    public void punchOut(){
         punchOutTime = LocalDateTime.now().getHour();
         hoursWorked = Math.abs(punchOutTime - punchInTime);

    }
    //Regular pay
    public double getRegularHours (){
        if (hoursWorked <= 40){
            return hoursWorked;
        }
        else {
            return 40;
        }
    }

    //Overtime hours
    public double getOvertimeHours (){
        if (hoursWorked >40 ){
            return hoursWorked - 40;
        }
        else {
            return 0;
        }
    }

    //Total Pay
    public double getTotalPay(){
        double regularPay = payRate * getRegularHours();
        double overtimePay = payRate *1.5 * getOvertimeHours();
        return regularPay + overtimePay;
    }



}
