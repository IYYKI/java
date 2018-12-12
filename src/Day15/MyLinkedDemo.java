package Day15;

import day10.Card;

public class MyLinkedDemo {
    public static void main (String [] args){
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.head);
    }
}
class MyLinkedList {
    Node head;
    public MyLinkedList(){
        Node head = new Node(new Card(Card.HEART,Card.NINE));
        head.next = new Node(new Card(Card.HEART,Card.THREE));
        head.next.next =new Node(new Card(Card.HEART,Card.JACK));
        head.next.next.next = new Node(new Card(Card.HEART,Card.QUEEN));
        System.out.println(head);
    }
    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        public String toString() {
            return data + (null != next ? "->" + next : "");
        }
    }
}