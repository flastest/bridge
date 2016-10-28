import */*/*;

public class Card {
    private int suit;    //the suit like hearts or spaeds
    private int value;   //the valyu of the card such as 14 for ace or 10 for jocker

    public Card(int newSuit, int newValue){
    }

    public void setSuit(int newSuit){
        suit = newSuit;
    }

    public int getSuit(){
        return suit;
    }

    public void setValue(int newValue){
        value = newValue;
    }

    public int getValue(){
        return value;
    }

    public String setName(String newName){
        name = newName;
    }

    public int number(int drumpf){ //number is calculation of trump and values
        if (suit == drumpf){
            return drumpf*2*100 + value;
        } else{
            return suit * 100 + value;
        }
    }

    public int points(){
        if (value > 9){
            return value - 9;
        }
        return 0;
    }

}
