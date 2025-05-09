package blackjack;

import java.util.ArrayList;
import java.util.List;
/*
    Hand models a players or dealers collection of cards
    - Stores the cards that have been dealt
    - calculate current state of the game
    - Manage how cards are added during gameplay
 */
public class Hand {
    //Attribute
    private List<Card> cardList = new ArrayList<>();

    //Constructor
    public Hand (){
        this.cardList = new ArrayList<>();
    }

    //A card is dealt to the hand and the hand is responsible to store the card
    public void Deal(Card card){
        //Adds a new card to the players hand when they're dealt a card
        cardList.add(card);
    }

    //The hand uses the methods of each card to determine the value of each card
    //and adds up all values
    public int getValue() {
        int value = 0;
        int aceCount = 0;

        for (Card card : cardList) {
            if (card.isFaceUp()) {  // Only consider cards that are face up
                if (card.getValue().equals("A")) {
                    value += 11;
                    aceCount++;
                } else {
                    value += card.getPointValue();
                }
            }
        }

        // Adjust Aces from 11 to 1 as needed to avoid busting
        while (value > 21 && aceCount > 0) {
            value -= 10;  // Effectively turning an Ace from 11 to 1
            aceCount--;
        }

        return value;
    }

    public void showAllCards(){
        for (Card card: cardList){
            if(!card.isFaceUp()){ //if the card is face down flip it
                card.flip();
            }
        }
    }

    public void hideAllCards(){
        for (Card card: cardList){
            if(card.isFaceUp()){ //if the card is face down flip it
                card.flip();
            }
        }
    }

    //Clears out all cards after a round ends
    public void clearHand (){
       cardList.clear();
    }

    public int getSize() {
        return cardList.size();
    }

}
