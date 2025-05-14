package day02.bankaccountmanager;

public class CheckingAccount extends BankAccount{
    private static final double TRANSACTION_FEE = 2.00;
    //NO Max withdraws on checking account per Fed policy

    //Constructor
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    @Override
    public double withdraw(double amount){
        //Maybe implement a feature using switch case or if else statement to add diff types of fees
        //So after every withdraw charge -$1.58
        if (getBalance() >= (amount + TRANSACTION_FEE)){
            setBalance(getBalance() - (amount + TRANSACTION_FEE));
            logTransaction("You have withdrawn: $" + amount + ", and a $" + TRANSACTION_FEE + " has been added to your transaction. New balance is now: " + getBalance());
            return getBalance();
        }
        else {
            System.out.println("Transaction Failed");
            logTransaction("Withdrawal of $" + amount + " has failed, due to insufficient funds.");
        }
        return getBalance();
    }
    @Override
    public void printSummary() {
        System.out.println("Checking Account Summary for " + getAccountHolder());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Flat withdrawal fee: $" + TRANSACTION_FEE);
        transactionHistory();
    }




}
