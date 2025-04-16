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
        String[] vowels = {"a","e","i","o","u"};
        int noOfVowels = 0;
        for (String vowel : vowels){
            if(certainString.contains(vowel)){
                noOfVowels +=1;
            }

        }
        System.out.println("Number of vowels in string is: " + noOfVowels);
    }
}
