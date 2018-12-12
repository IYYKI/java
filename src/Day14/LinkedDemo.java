package Day14;

import day10.Card;

public class LinkedDemo {
    public static void main (String [] args){
        Node head = new Node(new Card(Card.HEART,Card.NINE));
        head.next = new Node(new Card(Card.HEART,Card.THREE));
        head.next.next =new Node(new Card(Card.HEART,Card.JACK));
        head.next.next.next = new Node(new Card(Card.HEART,Card.QUEEN));
        System.out.println(head);
    }
}
class Node{
    Object data;
    Node next;
    public Node(Object data){
        this.data = data;
    }
    public String toString(){
        return data+(null!=next?"->"+next:"");
    }
}