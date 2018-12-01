package day10;

public class FinalDemo {
    final int b = 1;//不能再修改
    static final int C = 2;//C是常量
    public static void main(String [] args) {
        final int a = 1;
        //a++;错，不能修改final变量
        int x = add(3, 4);
        System.out.println(x);
    }
    public static int add(final int a,int b){
        //a++;错误，a不能改变
        b++;
        return a+b;
    }

}
final class Xoo{}//类不呢个再被继承类
//class Yoo extends Xoo{};//错
//class MyString extends String{};//错


class Yoo{
    final int getVal(){//final  的方法，不能被覆盖
        return 1;
    }
}
class Zoo extends Yoo{
    //int getVal(){//错误，final 的方法，不能被覆盖
    // return 2;
}


