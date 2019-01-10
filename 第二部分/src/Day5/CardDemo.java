package Day5;

import java.util.Arrays;
import java.util.Random;

public class CardDemo {
    public static void main(String []args){
        Card [] cards = new Card[54];
        int i = 0;
        for (int rank = Card.THREE;rank<=Card.DEUCE;rank++){
            cards[i++] = new Card(Card.DIAMOND,rank);
            cards[i++] = new Card(Card.CLUB,rank);
            cards[i++] = new Card(Card.HEART,rank);
            cards[i++] = new Card(Card.SPADE,rank);
        }
        cards[i++] = new Card(Card.JOKER,Card.BLACK);
        cards[i++] = new Card(Card.JOKER,Card.COLOR);
        System.out.println(Arrays.toString(cards));
        //洗牌,打乱
        Random random = new Random();
        for (i = cards.length -1;i>0;i--){
            int j = random.nextInt(i);
            Card card = cards[i];
            cards [i] = cards[j];
            cards [j] = card;
        }
        System.out.println(Arrays.toString(cards));
        //发牌
        Player [] players = {new Player(1,"老胡"),new Player(2,"张伟"),
        new Player(3,"yyk")};
        int j = 0;
        for (i = 0;i<cards.length;i++){
            Card card = cards[i];
            Player player = players[j++ % players.length];
            player.add(card);
        }
        System.out.println(players[0]);
        System.out.println(players[1]);
        System.out.println(players[2]);
    }
}
