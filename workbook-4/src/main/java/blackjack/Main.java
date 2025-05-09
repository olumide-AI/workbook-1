package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        Deck deck = new Deck();
        deck.shuffle();

        setupGame(players, scanner);

        boolean playAgain;
        do {
            dealInitialCards(players, deck);
            playPlayerTurns(players, deck, scanner);
            playDealerTurn(deck);
            determineResults(players);

            playAgain = askPlayAgain(scanner);
            if (playAgain) {
                resetGame(players, deck);
            }
        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    // ======================
    // 🎯 Helper Methods Below
    // ======================

    public static void setupGame(List<Player> players, Scanner scanner) {
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter name for Player " + i + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }
    }

    public static void dealInitialCards(List<Player> players, Deck deck) {
        for (Player player : players) {
            Hand hand = player.getHand();
            hand.Deal(deck.deal());
            hand.Deal(deck.deal());
            hand.showAllCards();
            System.out.println(player.getName() + "'s Hand Value: " + hand.getValue());
        }
    }

    public static void playPlayerTurns(List<Player> players, Deck deck, Scanner scanner) {
        for (Player player : players) {
            Hand hand = player.getHand();

            while (hand.getValue() < 21) {
                System.out.println(player.getName() + ", your current hand value is: " + hand.getValue());
                System.out.print("Do you want to 'hit' or 'stay'? ");
                String choice = scanner.nextLine().toLowerCase();

                if (choice.equals("hit")) {
                    Card newCard = deck.deal();
                    newCard.flip();
                    hand.Deal(newCard);
                    System.out.println("You drew: " + newCard.getValue() + " of " + newCard.getSuit());

                    if (hand.getValue() > 21) {
                        System.out.println("Busted! Your final hand value is: " + hand.getValue());
                        break;
                    }
                } else if (choice.equals("stay")) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 'hit' or 'stay'.");
                }
            }
        }
    }

    public static void playDealerTurn(Deck deck) {
        Hand dealerHand = new Hand();
        dealerHand.Deal(deck.deal());
        dealerHand.Deal(deck.deal());
        dealerHand.showAllCards();

        System.out.println("\nDealer's turn...");
        while (dealerHand.getValue() < 17) {
            Card newCard = deck.deal();
            newCard.flip();
            dealerHand.Deal(newCard);
            System.out.println("Dealer drew: " + newCard.getValue() + " of " + newCard.getSuit());
        }

        System.out.println("Dealer's final hand value: " + dealerHand.getValue());
    }

    public static void determineResults(List<Player> players) {
        // For simplicity, we'll assume the dealer's value is always 18 (mocked value).
        int dealerValue = 18;

        for (Player player : players) {
            int playerValue = player.getHand().getValue();
            System.out.println("\n" + player.getName() + "'s final hand value: " + playerValue);

            if (playerValue > 21) {
                System.out.println("Result: BUST! You lose.");
            } else if (dealerValue > 21 || playerValue > dealerValue) {
                System.out.println("Result: You win!");
            } else if (playerValue == dealerValue) {
                System.out.println("Result: Push (tie).");
            } else {
                System.out.println("Result: You lose.");
            }
        }
    }

    public static boolean askPlayAgain(Scanner scanner) {
        System.out.print("\nDo you want to play again? (yes/no): ");
        String answer = scanner.nextLine().toLowerCase();
        return answer.equals("yes");
    }

    public static void resetGame(List<Player> players, Deck deck) {
        for (Player player : players) {
            player.getHand().clearHand();
        }
        deck = new Deck(); // Create a fresh deck
        deck.shuffle();
        System.out.println("\nStarting a new round...\n");
    }

}
