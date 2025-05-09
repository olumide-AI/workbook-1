package blackjack;

public class Card {
    //Set properties
    private String suit;
    private String value;
    private boolean faceUp;

    //Constructor

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.faceUp = false; //Set faceup to false, so no cards are displayed
    }
    //Getters

    public String getSuit() {
        //Only return the suit if the card is face up
        if (isFaceUp()){
            return suit;
        }
        else {
            return "#";
        }
    }

    public String getValue() {
        //Only return the value if the card is face up
        if(isFaceUp()){
            //Value can be A,K,Q,J,10,9
            return value;
        }
        else {
            return "#";
        }
    }

    public boolean isFaceUp() {
        return faceUp;
    }
    //Methods
    public int getPointValue(){
        //Only return the value if the card is face up
        if (isFaceUp()){
            if(value.equals("A")){
                return 11;
            }
            else if (value.equals("K") || value.equals("J") || value.equals("Q") ) {
                return 10;
            }
            else {
                return Integer.parseInt(value);
            }
        }
        else {
            return 0;
        }
    }

}
