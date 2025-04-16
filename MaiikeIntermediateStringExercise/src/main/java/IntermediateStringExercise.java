import java.util.Scanner;

public class IntermediateStringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a string
        System.out.println("Type any string of your choice and i will tell you how many vowels are in it: ");
        String sentence = scanner.nextLine();
        countVowels(sentence);
    }
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
}
