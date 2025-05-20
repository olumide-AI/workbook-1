package day02.guessthenumber;

import com.sun.jdi.PrimitiveValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessingGame implements PlayableGame{
    private int targetNum;
    private Scanner scanner;
    private List<Integer> playerGuess;

    public GuessingGame(){
        this.playerGuess = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.targetNum = (int) (Math.random() *100);
    }

    @Override
    public void startGame() {
        System.out.println("Welcome to the game ");
        boolean running = true;
        while(running){
            System.out.println("Guess a number between 0 to 100");
            int guess = Integer.parseInt(scanner.nextLine());
            playerGuess.add(guess);

            if (guess > targetNum){
                System.out.println("Guess is too high, try again ");
            } else if (guess < targetNum) {
                System.out.println("Guess is too low, try again ");
            }
            else{
                System.out.println("You have guessed corectly ");
                running = false;
                System.out.println("Your guesses are:  " + playerGuess);
            }

        }
    }
}
