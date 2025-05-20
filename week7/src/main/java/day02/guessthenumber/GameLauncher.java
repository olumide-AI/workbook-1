package day02.guessthenumber;

import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎮 Welcome to Guess the Number!");
        System.out.println("Choose your difficulty:");
        System.out.println("1. Easy (1 to 50)");
        System.out.println("2. Medium (1 to 100)");
        System.out.println("3. Hard (1 to 500)");
        System.out.print("Enter 1, 2, or 3: ");

        String level = "";
        int maxRange = 100; // default

        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            level = "Easy";
            maxRange = 50;
        } else if (choice == 2) {
            level = "Medium";
            maxRange = 100;
        } else if (choice == 3) {
            level = "Hard";
            maxRange = 500;
        } else {
            System.out.println("Invalid choice. Defaulting to Medium.");
            level = "Medium";
            maxRange = 100;
        }

        System.out.println(" Difficulty set to: " + level);

        PlayableGame game = new GuessingGame(maxRange);
        game.startGame();
    }
}
