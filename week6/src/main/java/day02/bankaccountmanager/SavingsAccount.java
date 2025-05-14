package day02.bankaccountmanager;

public class SavingsAccount extends BankAccount{

    //Constructor
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    private static final int MAX_MONTHLY_WITHDRAWALS = 6;
    private int withdrawsCounter = 0;

    public double earnsInterest(double interestRate, int noOfMonths){
        //What does interest rate do and are we earning interest monthly or yearly
        //Is this added at the end of the yearly balance or periodically
        //Should it be a parameter user input or we get from somewhere or constant
        //Simple interest formula = principal * rate * time;
        double interest = getBalance() * interestRate * noOfMonths;
        setBalance(interest + getBalance());
        logTransaction("Interest earned: $" + interest + ", Total Balance after interest applied: $" + getBalance());
        return getBalance();
    }
    @Override
    public double withdraw(double amount){
        if(withdrawsCounter >= MAX_MONTHLY_WITHDRAWALS){
            System.out.println("You have reached your max withdrawals for the month");
            logTransaction("Withdrawal failed: monthly limit of " + MAX_MONTHLY_WITHDRAWALS + " reached.");
            return getBalance();
        }
        if (amount <= 0){
            System.out.println("Withdrawal must be greater than zero");
            logTransaction("Withdrawal failed: invalid amount $" + amount);
            return getBalance();
        }
        if (getBalance() >= amount){
            setBalance(getBalance()-amount);
            withdrawsCounter += 1;
            logTransaction("Withdrew: $" + amount + ", New Balance: $" + getBalance() + ", Withdrawals used: " + withdrawsCounter);
            return getBalance();
        }
        else{
            System.out.println("Can't withdraw, balance too low");
            logTransaction("Couldn't withdraw: $" + amount);
        }
        return getBalance();
    }
    @Override
    public void printSummary(){
        System.out.println("Savings Account Summary for " + getAccountHolder());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Withdrawals this month: " + withdrawsCounter);
        transactionHistory();
    }
}
