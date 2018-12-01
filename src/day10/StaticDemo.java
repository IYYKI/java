package day10;

public class StaticDemo {
    public static void main(String[] args){
        System.out.println("Start");
    Koo.b=1;
        System.out.println("Koo.b=1完成！");
    System.out.println(Koo.getB());
    Koo k1 = new Koo();
    Koo k2 = new Koo();
    System.out.println(Koo.b+","+k1.a+","+k2.a);
    System.out.println(k1.getA());
    int a = Math.abs(-1);
    String str = Integer.toBinaryString('中');
    }
}
class Koo{//静态代码块，在类的加载期间执行，只执行一次！
    static{
        System.out.println("加载了Koo!");
    }
    int a;
    static int b;
    public Koo(){
        a = b++;
    }
    int getA(){
        return a;
    }
    static int getB(){//
        return b;
    }
}