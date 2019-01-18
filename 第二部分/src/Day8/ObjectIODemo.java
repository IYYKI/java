package Day8;

import Day3.IOUtils;
import Day5.Card;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectIODemo {
    public static void main(String[] args)
            throws Exception {
        String file = "obj.dat";
        ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)));
        Object obj = new Foo();//obj = cards;
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Card.SPADE, Card.ACE));
        out.writeObject(obj);//对象的序列化到文件流中
        out.writeObject(cards);
        out.close();
        IOUtils.print(file);

        ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)));
        Foo f = (Foo)in.readObject();
        List<Card> others = (List<Card>)in.readObject();
        in.close();
        System.out.println(f.i + ","+f.name); //5,tom
        System.out.println(others);
        System.out.println("思考现象:深层复制!");
        System.out.println("obj==f:"+(obj==f));//false

        System.out.println("obj.name==f.name:"+(((Foo)obj).name==f.name));//false
        System.out.println("cards==others:"+(cards==others));//false

        System.out.println("cards(0)==others(0):"+(cards.get(0)==others.get(0
        )));//false
        System.out.println("浅层复制: ");
        List<Card> list = new ArrayList(cards);
        System.out.println("list==cards:"+(list==cards));//false

        System.out.println("list(0)==cards(0):"+(list.get(0)==cards.get(0)));
//true
    }
}
class Foo implements Serializable{
    int i=5;
    String name = "tom";
}