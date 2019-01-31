package Day11;

public class SyncDemo2 {
    public static void main (String [] args){
        final Foo foo = new Foo();
        Thread t = new Thread(){
            public void run(){
                foo.add();
            }
        };
        t.start();
        foo.add(8);
    }
}
class Foo{
    int a = 1;
    public synchronized void add(int b ){
        a+=b;
        System.out.println("add b start");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("add b over");
    }
    public synchronized void add(){
        a++;
        System.out.println("add start");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("add over");
    }
}
