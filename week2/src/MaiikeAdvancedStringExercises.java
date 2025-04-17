import java.util.Scanner;

public class MaiikeAdvancedStringExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name:");
        String name = scanner.nextLine();
        //greeting
        String greeting = greetFormally(name);
        System.out.println(greeting);
        //capitalize first letter
        String capitalFirst = capitalizeFirstLetter(name);
        System.out.println(capitalFirst);
        //replace badWord
        String badWord = "bad";
        String censor = censorWord(name, badWord);
        System.out.println("name: " + censor);
        //get email
        String email = getEmail(scanner);
        String isEmailValid = isValidEmail(email);
        System.out.println("email validity check: " + isEmailValid);
        //string builder
        String word1 = getWord(scanner, "Enter the first word: ").trim();
        String word2 = getWord(scanner, "Enter the second word: ").trim();
        String word3 = getWord(scanner, "Enter the third word: ").trim();

        String result = buildSentence(word1, word2, word3);
        System.out.println(result);
        scanner.close();
    }
    public static String greetFormally(String userName){
        return "Hello, Ms./Mr." + userName;
    }
    public  static String getEmail(Scanner scanner){
        System.out.println("What is your email");
        return scanner.nextLine();
    }
    public static String capitalizeFirstLetter(String userName){
        if (userName == null || userName.isEmpty()){
            return userName;
        }
        return userName.substring(0,1).toUpperCase() + userName.substring(1);
    }
    public static String censorWord(String userInput, String badWord){
        return userInput.replace(badWord, "***");
    }
    public static String isValidEmail(String userEmail){
        if (userEmail.endsWith(".com")&&userEmail.contains("@")){
            return "Email is valid";
        }
        else{
            return "Email is invalid";
        }
    }

    // Method to get a word from the user
    public static String getWord(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // Method to build the sentence using StringBuilder
    public static String buildSentence(String word1, String word2, String word3) {
        StringBuilder sentence = new StringBuilder();
        sentence.append("You said: ");
        sentence.append(word1).append(" ");
        sentence.append(word2).append(" ");
        sentence.append(word3).append(".");
        return sentence.toString().trim();
    }

}
