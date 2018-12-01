package cn.com.yyk;

public class Variable {

    public static void main(String[] args) {
        int a =1;
        a=a++;
        System.out.print(a);
        int i =0;
        a = i++%5;
        a = i++%5;//a=1
        a = i++%5;//a=2
        a = i++%5;//a=3
        //...
        System.out.print(a);
    }
}
