package Day14;

import day10.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListDemo {
    public static void main (String [] args) {
        List cards = new ArrayList();
        for (int rank = Card.THREE;rank<=Card.DEUCE;rank++) {
            cards.add(new Card(Card.DIAMOND, rank));
            cards.add(new Card(Card.CLUB, rank));
            cards.add(new Card(Card.HEART, rank));
            cards.add(new Card(Card.SPADE, rank));
        }
        cards.add(new Card(Card.JOKER,Card.BLACK));
        cards.add(new Card(Card.JOKER,Card.COLOR));
      System.out.println(cards);
      Card c = (Card)cards.get(3);
      System.out.println(c);//黑桃三
        //洗牌
        Random r = new Random();
        for (int i = cards.size()-1;i>0;i--){
            int idx = r.nextInt(i);
            Card x = (Card)cards.get(i);
            x = (Card)cards.set(idx,x);
            cards.set(i,x);

        }
    }
}
