package financeapplication;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio myPortfolio = new Portfolio("Retirement", "Jane Doe");

        myPortfolio.addValuable(new BankAccount("1001", "Jane", 15000));
//        myPortfolio.addValuable(new CreditCard("3000", "Jane", 10000, 3000));
//        myPortfolio.addValuable(new Jewelry("Diamond Ring", 2500, 18));
//        myPortfolio.addValuable(new House("Family Home", 200000, 1995, 2000, 4));
//
//        System.out.println("Total portfolio value: $" + myPortfolio.getValue());
    }
}
