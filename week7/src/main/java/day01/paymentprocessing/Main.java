package day01.paymentprocessing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payable> payables = new ArrayList<>();
        payables.add(new Invoice(20, 456));
        payables.add(new Freelancer(45));
        payables.add(new HourlyEmployee(60, 45));
        double totalPayment = 0;
        System.out.println("--- Payments ---");

        for (Payable payable: payables){

            if(payable instanceof Invoice){
                System.out.println("Invoice payment is: $" + payable.getPaymentAmount());
            } else if (payable instanceof Freelancer) {
                System.out.println("Free lancer payment is: $" + payable.getPaymentAmount());
            } else if (payable instanceof HourlyEmployee) {
                System.out.println("Employee rate is: $" + payable.getPaymentAmount());
            }
            else {
                return;
            }
            totalPayment += payable.getPaymentAmount();
        }
        System.out.println("Total payment is: " + totalPayment );
    }
}
