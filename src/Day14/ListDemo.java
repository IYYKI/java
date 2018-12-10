package Day14;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListDemo {
    public static void main (String [] args){
        //List 接口代表抽象的线性表概念，定义线性表的操作方法：如：add()
        //add（）remove（）size（）isEmpty（）contains（）...
        //ArrayList 利用Object[] 实现了具体的线性表（List）操作方法
        //add（）在Object [] 数组上实现了添加方法
        //ArrayList 是利用变长数组算法实现的List （线性表）
        List list = null;
        list = new ArrayList();//空集
        System.out.println(list.isEmpty());//true
        list.add("忐忑");//在调用接口中声明，由ArrayList实现的方法
        list.add("霸王别姬");
        System.out.println(list.isEmpty());//false
        System.out.println(list);//toString
        //LinkedList 是使用"双向循环链表"实现的线性表（List）
        //实现了全部的方法：add（）remove（）等
        //这些方法的底层操作的是"双向循环链表"的维护操作
        list = new LinkedList();
        list.add("忐忑");
        list.add("霸王别姬");
        System.out.println(list);
    }
}
