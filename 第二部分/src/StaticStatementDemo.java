public class StaticStatementDemo {
    public static void main (String [] args){
        Xoo x1 = new Xoo();
        Xoo x2 = new Xoo();
    }
    }
class Xoo{
    static {
        System.out.println("静态代码块，在类的加载期间执行");
    }
    {
        System.out.println("非静态代码块");
    }
    public Xoo(){
        System.out.println("执行构造器");
    }
}
