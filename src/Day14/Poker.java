package Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Poker {
    public static void main(String[] args) {
HashMap<Integer, String> bcy = new HashMap<>();//存放扑克牌和它的索引
ArrayList<Integer> list = new ArrayList<>();//存放扑克牌的索引
//生成扑克牌，从小到大存入集合中，这里采取的花色大小是：梅花<方片<黑桃<红桃        
String[] colors = {"♣","♦","♠","♥"};//花色数组
String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};//大小数组
int index = 0;//扑克牌的索引

//将扑克牌存放进HashMap集合中
for (int i = 0; i < numbers.length; i++) {
for (int j = 0; j < colors.length; j++) {
String puke = colors[j].concat(numbers[i]);
bcy.put(index, puke);
list.add(index);
index++;
            }
}
bcy.put(index, "小王");
list.add(index);
index++;
bcy.put(index, "大王");
list.add(index);
//洗牌
Collections.shuffle(list);
TreeSet<Integer> w1set = new TreeSet<>();//玩家1牌组集合
TreeSet<Integer> w2set = new TreeSet<>();//玩家2牌组集合
TreeSet<Integer> w3set = new TreeSet<>();//玩家3牌组集合
TreeSet<Integer> dpset = new TreeSet<>();//底牌牌组集合
//发牌
for (int i = 0; i < list.size(); i++) {
if (i >= list.size() - 3) {
dpset.add(list.get(i));
} else if (i % 3 == 0) {
w1set.add(list.get(i));
} else if (i % 3 == 1) {
w2set.add(list.get(i));
} else {
w3set.add(list.get(i));
            }
        }
int p = 0;//d表示地主牌的索引        
while (true) {
p = (int)(Math.random()*54);//产生一个0-53之间的随机数，对应着扑克的索引
if (!dpset.contains(p)) {//地主牌的索引不是底牌索引
break;//结束循环
}
}
System.out.println("地主牌为："+bcy.get(p));
if (w1set.contains(p)) {
w1set.addAll(dpset);
} else if (w2set.contains(p)) {
w2set.addAll(dpset);
} else {
w3set.addAll(dpset);
        }//看牌
look("玩家1", w1set, bcy);
look("玩家2", w2set, bcy);
look("玩家3", w3set, bcy);
look( "底牌", dpset, bcy);

}
    /**
      *
      * @param name 玩家名
      * @param set  玩家牌组集合
      * @param map  扑克牌集合
      */
        public static void look(String name, TreeSet<Integer> set, HashMap<Integer, String> map) {
System.out.println(name+"的牌是：");
for (Integer i : set) {
System.out.print(map.get(i)+" ");
}
System.out.println();
}

}