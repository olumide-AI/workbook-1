package blackjack;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {
    @Test
    public void testDeckStartsWith52Cards() {
        //ARRANGE
        Deck deck = new Deck();

        //ACT
        int initialSize = deck.getSize();

        // ASSERT
        assertEquals(52, initialSize, "A new deck should have exactly 52 cards.");
    }

    @Test
    public void testDealRemovesCardFromDeck() {
        // ARRANGE
        Deck deck = new Deck();

        // ACT
        Card dealtCard = deck.deal();

        // ASSERT
        assertNotNull(dealtCard, "Dealt card should not be null.");
        assertEquals(51, deck.getSize(), "After dealing one card, deck size should be 51.");
    }

    @Test
    public void testShuffleChangesDeckOrder() {
        // ARRANGE
        Deck deck = new Deck();

        // Capture the top card before shuffling
        Card firstCardBeforeShuffle = deck.deal();

        // Reset the deck and shuffle it
        deck = new Deck();
        deck.shuffle();

        // ACT
        Card firstCardAfterShuffle = deck.deal();

        // ASSERT (Not guaranteed to be different, but likely)
        // If by chance the same card is still on top, shuffle again.
        boolean isShuffled = !firstCardBeforeShuffle.getValue().equals(firstCardAfterShuffle.getValue()) ||
                !firstCardBeforeShuffle.getSuit().equals(firstCardAfterShuffle.getSuit());

        assertTrue(isShuffled, "Deck should be shuffled; top card should likely be different.");
    }

    // ============================
    //  Defensive Tests
    // ============================

    @Test
    public void testDealFromEmptyDeckReturnsNull() {
        // ARRANGE
        Deck deck = new Deck();

        //ACT: Deal all 52 cards
        for (int i = 0; i < 52; i++) {
            deck.deal();
        }

        // Try dealing one more card
        Card card = deck.deal();

        // ASSERT
        assertNull(card, "Dealing from an empty deck should return null.");
    }

    @Test
    public void testDeckSizeNeverGoesNegative() {
        //ARRANGE
        Deck deck = new Deck();

        // ACT: Over-deal cards
        for (int i = 0; i < 100; i++) {
            deck.deal();
        }

        //ASSERT
        assertEquals(0, deck.getSize(), "Deck size should never be negative.");
    }

    // ============================
    //  Edge Case Tests
    // ============================

    @Test
    public void testDealingAllCardsReturnsUniqueCards() {
        //ARRANGE
        Deck deck = new Deck();
        deck.shuffle();

        Set<String> dealtCards = new HashSet<>();

        //ACT: Deal all cards and record them
        for (int i = 0; i < 52; i++) {
            Card card = deck.deal();
            String cardIdentity = card.getSuit() + "-" + card.getValue();
            dealtCards.add(cardIdentity);
        }

        // ASSERT: Verify that all 52 cards were unique
        assertEquals(52, dealtCards.size(), "All dealt cards should be unique.");
    }
}
