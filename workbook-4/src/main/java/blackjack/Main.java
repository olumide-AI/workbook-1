package blackjack;

public class Main {
    public static void main(String[] args) {
        Card testCard = new Card("Spades", "K");

        // Card is face down, try getting the point value:
        System.out.println("Face down value: " + testCard.getPointValue());  // Expect: 0

        // Flip it face up:
        testCard.flip();
        System.out.println("Face up value: " + testCard.getPointValue());   // Expect: 11

        // Flip it back face down:
        testCard.flip();
        System.out.println("Face down again value: " + testCard.getPointValue());  // Expect: 0

    }
}
