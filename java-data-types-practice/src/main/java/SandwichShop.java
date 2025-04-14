import java.util.Scanner;

public class SandwichShop {
    //initalize scanner using static class
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Prompt the user for the size of the sandwich
        System.out.println("What sandwich size do you want?: (1: for regular or 2: for large)");
        int sandwichType = scanner.nextInt();
        System.out.println("You will be getting a " + sandwichType + " sandwich today.");

        //Based on user input, give them the price of the sandwich
        double choosenBasePrice = 0.0;
        double basePriceRegular = 5.45;
        double basePriceLarge = 8.95;
        if (sandwichType == 1){
            System.out.println("A regular sandwich base price is $" + basePriceRegular);
            choosenBasePrice = basePriceRegular;
        }
        else if (sandwichType == 2){
            System.out.println("A Large sandwich base price is $" + basePriceLarge);
            choosenBasePrice = basePriceLarge;
        }
        else{
            System.out.println("Invalid sandwich type selected.");
        }

        //Prompt the user for their age
        System.out.println("How old are you");
        int ageOfBuyer = scanner.nextInt();
        scanner.nextLine();
        if (ageOfBuyer <= 17){
            // give students a 10% discount
            double priceOfStudent = choosenBasePrice * 0.90;
            System.out.println("Due to the 10% discount students recieve, your sandwich price is now $: " + priceOfStudent);
            //give seniors a 20% discount
        } else if (ageOfBuyer >= 65) {
            double priceOfSeniors = choosenBasePrice * 0.80;
            System.out.println("Senior citizens are welcomed here and you will get a 30% discount, making your sandwich price now $: " + priceOfSeniors);
        }
        else {
            double regularBuyer = choosenBasePrice;
            System.out.println("Sorry you don't get any discount, your sandwich price is $: " + regularBuyer);
        }
    }
}
