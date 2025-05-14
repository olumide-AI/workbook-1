package day02.bankaccountmanager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> oluCapitalOne = new ArrayList<>();
        oluCapitalOne.add(new CheckingAccount("Olumide Kolawole", 3000));
        oluCapitalOne.add(new SavingsAccount("Olumide Kolawole", 5000));

        for (BankAccount bankAccount : oluCapitalOne){
            //bankAccount.deposit(700);
            //bankAccount.withdraw(1900);
            //bankAccount.printSummary();
        }

        for(BankAccount bankAccount: oluCapitalOne){
            if (bankAccount instanceof SavingsAccount){
                ((SavingsAccount) bankAccount).earnsInterest(0.02,12);
            }
        }

        // Print summaries
        System.out.println("\n----- ACCOUNT SUMMARIES -----\n");
        for (BankAccount account : oluCapitalOne) {
            account.printSummary();
            System.out.println();
        }


    }

}
