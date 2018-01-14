package com.company;

/**
 * Created by user on 27.06.2017.
 */
public class Card {
    //public enum CARDS {Ace, King, Queen, Jack, Ten, Nine,  Eight, Seven, Six, Five, Four, Three, Two};
    //public enum SUIT {Clubs, Diamonds, Hearts, Spades}

    final static char CARDS [] = {'a', 'k', 'q', 'j', 't', '9', '8', '7', '6', '5', '4', '3', '2'};
    final static char SUIT [] = {'c', 'd', 'h', 's'};
    public Character card;
    public Character suit;

    public Card(char card, char suit) {
        this.card = new Character(Character.toUpperCase(card));
        this.suit = new Character(Character.toUpperCase(suit));

    }

    @Override
    public String toString() {
        return ""+card.charValue() + suit.charValue();
    }
}
