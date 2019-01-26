package Day10;

public class InitThreadDemo {
    public static void main (String [] args){
        class Tester implements Runnable{
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println(t.getName());
            }
        }
        Thread t1 = new Thread(new Tester());
        t1.start();
        Runnable r = new Runnable(){
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println(t.getName());
            }
        };
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t2.start();
        t3.start();
        Thread t4 = new Thread(new Runnable(){
           public void run(){
               Thread t = Thread.currentThread();
               System.out.println(t.getName());
           }
        });
        t4.start();
        new Tester(){
            public void start() {
            }

            public void run(){
                Thread t = Thread.currentThread();
                System.out.println(t.getName());
            }
        }.start();
    }
}
