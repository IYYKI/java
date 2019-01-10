package Day5;

import java.util.ArrayList;

public class CardDemo2 {
    public static void main (String [] args){
        ArrayList cards = new ArrayList();
        cards.add(new Card(Card.SPADE,Card.TEN));
        cards.add(new Card(Card.SPADE,Card.JACK));
        cards.add(new Card(Card.SPADE,Card.QUEEN));
        cards.add(new Card(Card.SPADE,Card.KING));
        cards.add(new Card(Card.SPADE,Card.ACE));
        System.out.println(cards);
        Card ace = new Card(Card.SPADE,Card.ACE);
        System.out.println(cards.contains(ace));
        System.out.println(cards.indexOf(ace));
    }
}
