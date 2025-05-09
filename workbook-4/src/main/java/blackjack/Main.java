package blackjack;

public class Main {
    public static void main(String[] args) {
        Card testCard = new Card("Spades", "A");
        testCard.flip();
        System.out.println(testCard);
    }
}
