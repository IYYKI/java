package Day14;

import day10.Card;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main (String [] args){
        Collection cards = null;
        cards = new ArrayList();
        System.out.println(cards.isEmpty());//true
        cards.add(new Card(Card.SPADE,Card.NINE));
        System.out.println(cards.isEmpty());//false
        System.out.println(cards.size());//1
        cards.add(new Card(Card.SPADE,Card.TEEN));
        cards.add(new Card(Card.SPADE,Card.JACK));
        cards.add(new Card(Card.SPADE,Card.QUEEN));
        cards.add(new Card(Card.SPADE,Card.KING));
        cards.add(new Card(Card.SPADE,Card.ACE));
        System.out.println(cards.size());//6
        System.out.println(cards);
    }
}
