package financeapplication;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;
    private double currentDebt;
    private double creditLimit;

    public CreditCard(String name, String accountNumber, double balance, double creditLimit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //INTERFACE
    @Override
    public double getValue() {
        return creditLimit - currentDebt;
    }

    public double charge(double amount){
         currentDebt += amount;
        return currentDebt;
    }

    public double pay(double amount){
        currentDebt -= amount;
        return currentDebt;
    }

    public String toString() {
        return "Credit Card #" + getAccountNumber() + " (" + getName() + ") $" + getValue() + " available";
    }

}
