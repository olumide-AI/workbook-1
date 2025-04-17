import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userSentence = getSentence(scanner);
        //number of char
        int noOfChar = noOfCharacters(userSentence);
        System.out.println("Your sentence length is " + noOfChar);
        //number of words
        int noOfWords = noOfWords(userSentence);
        System.out.println("You have " + noOfWords + " different words");
        //Display first and last
        String firstAndLast = firstAndLastChar(userSentence);
        displayFirstAndLast(firstAndLast.charAt(0), firstAndLast.charAt(1));

        scanner.close();
    }
    /*
       Ask the user for a sentence
       show the number of character - length
       shows the number of word
       split it and print the length
       get the first and last character of sentence or words
     */
    //Ask user
    public static String getSentence(Scanner scanner){
        System.out.println("Input a sentence: ");
        return scanner.nextLine().trim();
    }
    //get number of char
    public static int noOfCharacters(String userInput){
        return userInput.length();
    }
    //number of words
    public static int noOfWords(String userInput){
        //Using split
        String[] splitWords = userInput.split(" ");
        return splitWords.length;
    }
    public static String firstAndLastChar(String userInput){
        char firstChar = userInput.charAt(0);
        char lastChar = userInput.charAt(userInput.length() -1);
        return "" + firstChar + lastChar;
    }
    public static void displayFirstAndLast(char firstChar, char lastChar){
        System.out.println("The first char is " + firstChar + " and the last char is " + lastChar);
    }
}
