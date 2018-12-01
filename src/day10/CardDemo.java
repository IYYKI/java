package day10;

import java.util.Random;

public class CardDemo {
    public static void main(String [] args){
        Card ace = new Card(Card.SPADE,Card.ACE);
        Card[] cards = new Card[54];
        //str.charAt(i++)
        int i = 0;
        for (int rank = Card.THREE;rank<=Card.DEUCE;rank++){
            cards[i++] = new Card(Card.DIAMOND,rank);
            cards[i++] = new Card(Card.CLUB,rank);
            cards[i++] = new Card(Card.HEART,rank);
            cards[i++] = new Card(Card.SPADE,rank);
        }
        cards[i++] = new Card(Card.JOKER,Card.BLACK);
        cards[i++] = new Card(Card.JOKER,Card.COLOR);

        Random r = new Random();
    for (i=cards.length-1;i<=1;i--){
        int j = r.nextInt(i);
        Card temp = cards[i];
        cards[i]=cards[j];
        cards[j]=temp;
    }
    for (i=0;i<cards.length;i++){
        Card c = cards[i];
        System.out.println(c.getSuitNames()+','+c.getRankNames()+" ");
    }
    }
}
