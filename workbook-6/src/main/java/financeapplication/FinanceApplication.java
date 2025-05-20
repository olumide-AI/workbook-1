package financeapplication;

import java.util.Scanner;

public class FinanceApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Personal Assets", "user");
        boolean running = true;
        while (running){
            System.out.println("Add a new asset:");
            System.out.println("Select 1 for Bank Account");
            System.out.println("Select 2 for Credit Card");
            System.out.println("Select 3 for Jewelry");
            System.out.println("Select 4 for Gold");
            System.out.println("Select 5 for House");
            System.out.println("Select 6 for Show Summary");
            System.out.println("Select 0 for Exit Application");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Account Number");
                    String accountNumber = scanner.nextLine();
                    System.out.println("Account Owner");
                    String owner = scanner.nextLine();
                    System.out.println("Account Balance");
                    double balance = Double.parseDouble(scanner.nextLine());
                    portfolio.addValuable(new BankAccount(accountNumber,owner,balance));
                    break;
                case 2:
                    System.out.println("Account owner name");
                    String creditAccountOwner = scanner.nextLine();
                    System.out.println(" Credit card number");
                    String creditCardNum = scanner.nextLine();
                    System.out.println("Credit Balance");
                    double creditBalance = Double.parseDouble(scanner.nextLine());
                    System.out.println("Credit Limit");
                    double creditLimit = Double.parseDouble(scanner.nextLine());
                    portfolio.addValuable(new CreditCard(creditAccountOwner, creditCardNum, creditBalance, creditLimit));
                    break;
                case 3:
                    System.out.println(" Jewlery Name");
                    String jewleryName = scanner.nextLine();
                    System.out.println("jewlery Value");
                    double jewleryValue = Double.parseDouble(scanner.nextLine());
                    System.out.println("karat");
                    double karat = Double.parseDouble(scanner.nextLine());
                    portfolio.addValuable(new Jewelry(jewleryName, jewleryValue, karat));
                    break;
                case 4:
                    System.out.println(" Gold Name");
                    String goldName = scanner.nextLine();
                    System.out.println("Gold Value");
                    double goldValue = Double.parseDouble(scanner.nextLine());
                    System.out.println("Gold Weight");
                    double goldWeight = Double.parseDouble(scanner.nextLine());
                    portfolio.addValuable(new Gold(goldName, goldValue, goldWeight));
                    break;
                case 5:
                    System.out.println("House Name");
                    String houseName = scanner.nextLine();
                    System.out.println("House Value");
                    double houseValue = Double.parseDouble(scanner.nextLine());
                    System.out.println(" Year Built");
                    int yearBuilt = Integer.parseInt(scanner.nextLine());
                    System.out.println("Square Feet");
                    int sqFt = Integer.parseInt((scanner.nextLine()));
                    System.out.println("Number of bedrooms");
                    int noOfBedrooms = Integer.parseInt((scanner.nextLine()));
                    portfolio.addValuable(new House(houseName, houseValue, yearBuilt, sqFt,noOfBedrooms));
                    break;
                case 6:
                    System.out.println("\\n--- Portfolio Summary ---");
                    for (Valuable valuable: portfolio.getValuables()){
                        System.out.println(valuable.toString());
                    }
                    System.out.println("Total Value: $" + portfolio.getValue());
                    System.out.println("Most Valuable: " + portfolio.getMostValuable().toString());
                    System.out.println("Least Valuable: " + portfolio.getLeastValuable().toString());
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
            scanner.close();
    }
}
