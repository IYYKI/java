package cn.com.yyk;

public class ConstrucrotDemo {
    public static void main(String args){
      Goo goo = new Goo();
      System.out.println(goo.a);
    }
}
class Foo extends Object{
    int a =1;
    public Foo(int a){
        super();
        this.a=a;
    }
}
//class Goo extends Foo{}//错，父类没有五参数构造器
class  Goo extends Foo{
    public Goo(){
        super(5);
    }
}