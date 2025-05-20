package day01.paymentprocessing;

public class HourlyEmployee implements Payable{
    private int hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPaymentAmount() {
        double overtimeHrs = 0;
        double overtimePay = 0;
        if(hoursWorked < 0){
            System.out.println("Didnt' worke any hours ");
            return 0;
        }
        if (hoursWorked < 40){
            return hourlyRate * hoursWorked;
        }
        else {
            overtimeHrs = hoursWorked - 40;
            overtimePay = overtimeHrs * hourlyRate *1.5;
            double regularPay = 40 * hourlyRate;
            return  regularPay + overtimePay;
        }
    }
}
