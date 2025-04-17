import java.util.Scanner;

public class IntermediateStringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a string
        System.out.println("Type any string of your choice and i will tell you how many vowels are in it: ");
        String sentence = scanner.nextLine();
        //count vowels
        countVowels(sentence);

        //reverse string
        String reverseString = reverseString(sentence);
        System.out.println("your sentence reversed is " + reverseString);

        //getting user number as a string
        String userNum = getNumAsString(scanner);
        System.out.println("your number is: " + userNum);

        //give user new num
        System.out.println("your new number is: " + convertStringToNum(userNum));

        //get user birthday
        String userBirthday = userBirthday(scanner);
        System.out.println("Your birthday day is: " + dayOfBirthday(userBirthday));

        //Is name a palindrome"
        isPalindrome(sentence);

        // close scanner
        scanner.close();
    }
    //count vowels method
    public static void countVowels(String certainString){
        //Used chatgpt for final solution
        certainString = certainString.toLowerCase();
        String vowels = "aeiou";
        int noOfVowels = 0;

        //loops start from index 0 to length, i++ goes one number at a time
        for (int i = 0; i < certainString.length(); i++){
            //grabs the current char at that position/index
            char letter = certainString.charAt(i);
            //This if statement checks if current letter on that index is a vowel or not
            if (vowels.indexOf(letter) != -1){
                //increment the vowels by one
                noOfVowels ++;
            }
        }
        System.out.println("Number of vowels in string is: " + noOfVowels);
    }
    // 11. Reverse string method
    public static String reverseString(String input){
        //StringBuilder lets you change strings from immutable to mutable
        //reverse() reverses all characters
        //toString() converts back to string
        return new StringBuilder(input).reverse().toString();
    }
    //12. Get a number as a string from user
    public static String getNumAsString(Scanner scanner){
        System.out.println("Type a number, don't worry it will be a string: ");
        return scanner.nextLine();
    }

    //Convert the string number to int and multiply by 2
    public static int convertStringToNum(String input){
        int num = Integer.parseInt(input);
        return num *2;
    }

    //13. Extract Day from date
    // Ask user for their b-day in this format "2025-04-16"
    public static String userBirthday(Scanner scanner){
        System.out.println("What is your birthday in this format 2025-04-16 ");
        return scanner.nextLine().trim();
    }
    //print the day to the user using substring
    public static String dayOfBirthday(String birthdayInput){
        //begins from index 8: to the end os string
        return birthdayInput.substring(8);
    }
    //Is user name a palindrome
    public static void isPalindrome(String sentence){
        String reverseSentence = new StringBuilder(sentence).reverse().toString();
        if (sentence.equals(reverseSentence) ){
            System.out.println("Your sentence is a palindrome");
        }
        else{
            System.out.println("Your sentence is not a palindrome");
        }
    }
}
