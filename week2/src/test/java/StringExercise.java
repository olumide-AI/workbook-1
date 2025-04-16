import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //get name
        String userName = getName(scanner);
        System.out.println("Hello " + userName);

        //get second name
        String secondName = getSecondName(scanner);
        System.out.println("what a nice middle name "+ secondName);

        //get length
        int length = getLength(userName);
        System.out.println("Your name has a of length: " + length);

        //get last and first character
        System.out.println("Your first character of your name is " + userName.charAt(0) + " your last char is " + userName.charAt(userName.length()-1));

        // get lower and upper
        System.out.println("Your name in lowercase is: " + userName.toLowerCase());
        System.out.println("Your name in Uppercase is: " + userName.toUpperCase());

        // contain java
        if (containJava(userName)){
            System.out.println("Your sentence contains the word 'java'.");
        }
        else{
            System.out.println("Your sentence doesn't contain the word 'java'.");
        }
        // are they equal
        if (userName.equals(secondName)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are NOT equal.");
        }

        //Start with A and Z
        if (getStartAEndZ(userName)) {
            System.out.println("Your name starts with 'A' and ends with 'Z'.");
        } else {
            System.out.println("Your name doesn't start with 'A' and end with 'Z'.");
        }

        //compare two word alphabetically
        System.out.println(userName.compareTo(secondName));





        //

    }
    public static String getName(Scanner scanner){
        System.out.println("What is your name: ");
        return scanner.nextLine();
    }
    public static int getLength(String characters){
        return characters.length();
    }
    public static boolean containJava(String word){
       return word.contains("java");
    }
    public static String getSecondName(Scanner scanner) {
        System.out.println("What is your middle name: ");
        return scanner.nextLine();
    }
    public static boolean getStartAEndZ(String word){
        return word.startsWith("A") && word.startsWith("Z");
    }







//    public  static String getChar(String words){
//        char firstChar = words.charAt(0);
//        char lastChar = words.charAt(words.length()-1);
//        return "" + firstChar + lastChar;
        //System.out.println("Your word's first character is: "+firstLetter+" and it's last is: "+lastLetter);
//    }


}
