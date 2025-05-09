package blackjack;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HandTest {
    //Standard testing - Normal behaviour
    @Test
    public void testAddCardToHand (){
        //Arrange
        Card testCard = new Card("Spades", "A");
        Hand testHand = new Hand();

        //Act: perform the action you're testing
        testHand.Deal(testCard);

        //Assert: Verify the result (Did the card actually get added
        //you will need a method to check the size of the hand lets assume you have getSize();
        assertEquals(1,testHand.getSize());
        }

    @Test
    public void testGetValueWithoutAce() {
        //  ARRANGE
        Card card1 = new Card("Clubs", "10");
        Card card2 = new Card("Diamonds", "9");
        Hand hand = new Hand();
        hand.Deal(card1);
        hand.Deal(card2);

        // Flip cards to make them visible
        hand.showAllCards();

        //  ACT
        int handValue = hand.getValue();

        // 🔵 ASSERT
        assertEquals(19, handValue, "Hand value should be 19.");
    }

    @Test
    public void testGetValueWithAllCardsFaceDown() {
        //  ARRANGE
        Card card1 = new Card("Spades", "A");
        Card card2 = new Card("Hearts", "10");
        Hand hand = new Hand();
        hand.Deal(card1);
        hand.Deal(card2);

        //  ACT: Do NOT flip the cards—leave them hidden
        int handValue = hand.getValue();

        //  ASSERT
        assertEquals(0, handValue, "Value should be 0 when all cards are hidden.");
    }

    @Test
    public void testEmptyHandValue() {
        //  ARRANGE
        Hand hand = new Hand();

        //  ACT: Hand is empty
        int value = hand.getValue();

        //  ASSERT
        assertEquals(0, value, "An empty hand should have a value of 0.");
    }


    @Test
    public void testGetValueWithAceAdjustment() {
        // 🟢 ARRANGE
        Card ace = new Card("Spades", "A");
        Card card2 = new Card("Hearts", "10");
        Card card3 = new Card("Clubs", "5");
        Hand hand = new Hand();

        hand.Deal(ace);
        hand.Deal(card2);
        hand.Deal(card3);

        hand.showAllCards();  // Reveal all cards

        //  ACT
        int value = hand.getValue();

        //  ASSERT
        // Without adjustment: 11 (Ace) + 10 + 5 = 26 → bust!
        // Adjust Ace to 1: 1 + 10 + 5 = 16
        assertEquals(16, value, "Ace should adjust to avoid busting; total should be 16.");
    }

    @Test
    public void testMultipleAcesAdjustment() {
        //  ARRANGE
        Card ace1 = new Card("Spades", "A");
        Card ace2 = new Card("Hearts", "A");
        Card card = new Card("Diamonds", "9");
        Hand hand = new Hand();

        hand.Deal(ace1);
        hand.Deal(ace2);
        hand.Deal(card);

        hand.showAllCards();

        //  ACT
        int value = hand.getValue();

        //  ASSERT
        // Without adjustment: 11 + 11 + 9 = 31 (bust!)
        // Adjust one Ace: 1 + 11 + 9 = 21 (correct)
        assertEquals(21, value, "One Ace should adjust to avoid busting; total should be 21.");
    }


}
