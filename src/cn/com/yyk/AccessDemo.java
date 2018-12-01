package cn.com.yyk;
public class AccessDemo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println(foo.b++);
        System.out.println(foo.c++);
        System.out.println(foo.d++);
    }
static class Foo{
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;
    public int getA(){
        return a;
    }
    }
}