# 📘 Using `Scanner` as a Parameter in Java

---

## 🔍 Overview

When writing Java programs that take user input, you often use a `Scanner` object. Instead of creating a new `Scanner` in every method, a better practice is to **pass it as a parameter**. This keeps your code cleaner, more reusable, and easier to test.

---

## 🧠 Behavioral Goal

The **behavior** we want is simple:

- Read user input (strings, integers, etc.).
- Reuse the input mechanism across multiple methods.
- Avoid duplicating code or opening multiple `Scanner` instances.

---

## 🧭 Strategy

```java
//Instead of this:
public static void getInput() {
    Scanner scanner = new Scanner(System.in);  // ❌ Not ideal
    ...
    scanner.close();
}
// Do this  

public static void getInput(Scanner scanner) {
    ...
}
// Then add to your main 

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    getInput(scanner);
    scanner.close();  // ✅ Only close once
}
```

## Implementaion Guide

```java
// General Method - pass the scanner once and use it everywhere 
public static ReturnType methodName(Scanner scanner) {
    // Use scanner.nextLine(), nextInt(), etc.
}

//Strings
public static String readName(Scanner scanner) {
    System.out.print("Enter your name: ");
    return scanner.nextLine();
}

//int
public static int readAge(Scanner scanner) {
    System.out.print("Enter your age: ");
    return scanner.nextInt();
}

//bool
public static boolean confirmChoice(Scanner scanner) {
    System.out.print("Continue? (true/false): ");
    return scanner.nextBoolean();
}

// void methods using input 
public static void greetUser(Scanner scanner) {
    System.out.print("What's your name? ");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
}

//testing friendly design 
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        String fakeInput = "Alice\\n23\\ntrue\\n";
        Scanner testScanner = new Scanner(fakeInput);

        String name = readName(testScanner);
        int age = readAge(testScanner);
        boolean proceed = confirmChoice(testScanner);

        System.out.println(name + ", " + age + ", " + proceed);
        testScanner.close();
    }
}
```
## Full Working Example: Guess the Secret Word Game
```java
import java.util.Scanner;

public class SecretWordGame {

    // Ask the player for their name using Scanner input
    public static String getPlayerName(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine().trim();
    }

    // Ask the player to guess the word, passing Scanner and remaining attempts
    public static String askForGuess(Scanner scanner, int attemptsLeft) {
        System.out.print("You have " + attemptsLeft + " guesses left. Enter your guess: ");
        return scanner.nextLine().trim().toLowerCase();
    }

    // Provide game instructions — no input needed here!
    public static void showInstructions(String secretWord, int maxAttempts) {
        System.out.println("🕵️ Welcome to the Secret Word Game!");
        System.out.println("Try to guess the secret word with " + maxAttempts + " chances.");
        System.out.println("The word has " + secretWord.length() + " letters.\n");
    }

    // Determine how many attempts the player gets based on difficulty
    public static int getAttemptsByDifficulty(String difficulty) {
        switch (difficulty.toLowerCase()) {
            case "easy": return 10;
            case "medium": return 5;
            case "hard": return 3;
            default: return 5;  // fallback
        }
    }

    // Ask the user to pick a difficulty level (Scanner + validation)
    public static String chooseDifficulty(Scanner scanner) {
        System.out.print("Choose difficulty (easy / medium / hard): ");
        return scanner.nextLine().trim().toLowerCase();
    }

    // Main game loop — mixes parameters: Scanner + name + secret word + attempts
    public static void playGame(Scanner scanner, String playerName, String secretWord, int maxAttempts) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            String guess = askForGuess(scanner, maxAttempts - attempt + 1);
            if (guess.equals(secretWord)) {
                System.out.println("🎉 Congratulations, " + playerName + "! You guessed it!");
                return;
            } else {
                System.out.println("❌ Nope! Try again.\n");
            }
        }

        System.out.println("😢 Sorry, " + playerName + ". You've run out of guesses.");
        System.out.println("The secret word was: " + secretWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // ✅ create Scanner ONCE

        String secretWord = "java";
        String difficulty = chooseDifficulty(scanner);  // get difficulty input
        int maxAttempts = getAttemptsByDifficulty(difficulty);  // no Scanner here

        showInstructions(secretWord, maxAttempts);  // non-interactive info
        String playerName = getPlayerName(scanner);  // get player's name
        playGame(scanner, playerName, secretWord, maxAttempts);  // mix of params

        scanner.close();  // ✅ close only once at the end
    }
}
```
## 🧠 Key Takeaways

| Pattern                          | Where It Happens                                 |
|----------------------------------|---------------------------------------------------|
| `Scanner` passed with other parameters | `playGame(Scanner, String, String, int)`     |
| Method uses only `Scanner`      | `getPlayerName(Scanner)`, `chooseDifficulty(Scanner)` |
| Method uses no `Scanner`        | `showInstructions(String, int)`, `getAttemptsByDifficulty(String)` |
| One `Scanner` only              | Created once in `main`, passed to every method   |



