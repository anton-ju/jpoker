package com.company;

/**
 * Created by user on 26.06.2017.
 */
public class Hand {
    private Card card1;
    private Card card2;

    public Hand(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }
    public Hand(String cards) {
        if (cards.length() == 4){
            card1 = new Card(cards.charAt(0), cards.charAt(1));
            card2 = new Card(cards.charAt(2), cards.charAt(3));
         }
        else return;

    }


    public boolean isSuit(){
        if(card1.suit.equals(card2.suit))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        if (isSuit()) {
            return "" + card1.card + card2.card + 's';
        }
        else
            return "" + card1.card + card2.card + 'o';

    }
}
