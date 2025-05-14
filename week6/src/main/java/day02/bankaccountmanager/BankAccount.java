package day02.bankaccountmanager;

import java.util.ArrayList;
import java.util.List;

//Base Class
public class BankAccount {
    //Properties
    private String accountHolder;
    private double balance;
    private List<String> transactionLog = new ArrayList<>();

    //Constructor


    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    //Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Methods
    public void logTransaction(String transactionDetails){
        transactionLog.add(transactionDetails);
    }

    public double deposit(double amount){
        //balance + amount
        //Will return a double for feature use
        if (amount <= 0){
            System.out.println("Deposit must be greater than or equal to zero");
            return balance;
        }
        balance = balance + amount;
        logTransaction("Deposited: $" + amount + " , Total Balance is now: $" + balance);
        return balance;
    }

    public double withdraw(double amount){
        //balance - withdraw
        //return double balance
        //if balance > withdraw we can withdraw
        //If amount is less than zero no operation
        if (amount <= 0){
            System.out.println("Withdrawal must be greater than zero");
            return balance;
        }
        if (balance >= amount){
            balance -= amount;
            logTransaction("Withdrew: $" + amount + ", Total Balance is now: $" + (balance));
            return balance;
        }

        else{
            System.out.println("Can't withdraw, balance too low");
            logTransaction("Couldn't withdraw: $" + amount);
        }
        return balance;
    }

    public void transactionHistory(){
        //How to implement it, should it be static ?
        System.out.println("Transaction history for " + getAccountHolder() + ":");
        for (String entry : transactionLog){
            System.out.println(": -> " + entry);
        }
    }

    public void printSummary() {
        System.out.println("Account Summary for " + getAccountHolder());
        System.out.println("Balance: $" + getBalance());
        transactionHistory();
    }



}
