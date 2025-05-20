package financeapplication;

public class BankAccount implements Valuable{
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return balance;
    }
    //Adds a balance
    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    @Override
    public String toString() {
        return "Bank Account #" + accountNumber + " (" + owner + ") $" + balance;
    }

}
