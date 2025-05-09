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
    public int getValue(){
        int value = 0;
        for (Card card: cardList){
            card.flip(); //turn the card over to see the value
            value = value + card.getPointValue();//Calculates the total value of the card in hand 
            card.flip(); //hide the card again
        }
        return value;
    }
}
