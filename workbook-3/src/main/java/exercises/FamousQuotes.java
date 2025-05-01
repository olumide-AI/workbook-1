package main.java.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FamousQuotes {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Get quotes array
        String[] quote = favQuotes();
        boolean keepGoing = true;
        while(keepGoing){
            try{
                System.out.println("Select a number between 1 and 10: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();

                if (userInput >=1 && userInput <=10){
                    System.out.println("\n Your quote is");
                    System.out.println(quote[userInput -1]);
                }
                else {
                    System.out.println("Invalid selection.Please Select a number between 1 and 10:");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Please select a number" +e.getMessage());
                scanner.nextLine();
            }
            System.out.println("\n Would you like to see another quote");
            String answer = scanner.nextLine().trim().toLowerCase();

            if(!answer.equalsIgnoreCase("yes")){
                keepGoing = false;
                System.out.println("Thank you ");
            }

        }

    }
    public static String[] favQuotes(){
        //Create an array of strings to store 10 quotes
        String[] favQuote = new String[10];
        favQuote[0] = "For God so loved the world, that he gave his only Son...";
        favQuote[1] = "I can do all things through Christ who strengthens me.";
        favQuote[2] = "The only thing we have to fear is fear itself.";
        favQuote[3] = "That's one small step for man, one giant leap for mankind.";
        favQuote[4] = "To be, or not to be, that is the question.";
        favQuote[5] = "I think, therefore I am.";
        favQuote[6] = "In the middle of difficulty lies opportunity.";
        favQuote[7] = "The unexamined life is not worth living.";
        favQuote[8] = "Be the change that you wish to see in the world.";
        favQuote[9] = "Life is what happens when you're busy making other plans.";

        return favQuote;
    }
}
