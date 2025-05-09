package blackjack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    //Standard testing - Normal behaviour
    @Test
    public void testFaceUpAceValue() {
        Card card = new Card("Spades", "A");
        card.flip();
        assertEquals(11, card.getPointValue(), "Face-up Ace should return 11 points.");
    }

    @Test
    public void testFaceUpKingValue() {
        Card card = new Card("Hearts", "K");
        card.flip();
        assertEquals(10, card.getPointValue(), "Face-up King should return 10 points.");
    }

    @Test
    public void testNumericCardValue() {
        Card card = new Card("Diamonds", "7");
        card.flip();
        assertEquals(7, card.getPointValue(), "Face-up 7 should return 7 points.");
    }

    //Defensive testing - invalid or unexpected situations
    @Test
    public void testFaceDownCardAlwaysZero() {
        Card card = new Card("Spades", "A");
        assertEquals(0, card.getPointValue(), "Face-down card should return 0 points.");
    }

    @Test
    public void testFlipTogglesCorrectly() {
        Card card = new Card("Clubs", "Q");
        assertFalse(card.isFaceUp(), "Card should start face down.");

        card.flip();
        assertTrue(card.isFaceUp(), "Card should be face up after one flip.");

        card.flip();
        assertFalse(card.isFaceUp(), "Card should be face down after second flip.");
    }

    @Test
    public void testInvalidNumericValueHandling() {
        Card card = new Card("Spades", "Z"); // "Z" is not a valid card value
        card.flip();

        Exception exception = assertThrows(NumberFormatException.class, () -> {
            card.getPointValue();
        });

        assertTrue(exception.getMessage().contains("For input string"), "Invalid value should throw NumberFormatException.");
    }

    //Edge case testing - Boundary and special scenarios
    @Test
    public void testAcePointValueDoesNotAutomaticallyAdjust() {
        Card card = new Card("Hearts", "A");
        card.flip();
        // Ace should return 11 by default, not 1 unless logic is added for it.
        assertEquals(11, card.getPointValue(), "Ace should default to 11.");
    }

    @Test
    public void testLowestNumericCardValue() {
        Card card = new Card("Diamonds", "2");
        card.flip();
        assertEquals(2, card.getPointValue(), "Face-up 2 should return 2 points.");
    }

    @Test
    public void testHighestNumericCardValue() {
        Card card = new Card("Clubs", "10");
        card.flip();
        assertEquals(10, card.getPointValue(), "Face-up 10 should return 10 points.");
    }

    @Test
    public void testCaseSensitivityOfCardValues() {
        Card card = new Card("Spades", "a");  // Lowercase ace
        card.flip();

        // Expect this to throw NumberFormatException because "a" isn't "A"
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            card.getPointValue();
        });

        assertTrue(exception.getMessage().contains("For input string"), "Case sensitivity should be handled or documented.");
    }



}
