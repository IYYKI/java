package Day10;

public class ThreadDemo {
    public static void main (String [] args){
        Person1 p1 = new Person1();
        Person2 p2 = new Person2();
        Person3 p3 = new Person3();
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setDaemon(true);
        p3.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
        System.out.println("main Over!");
    }
     static class Person3 extends Thread{
        public void run(){
            for (int i = 0 ; i <100; i++){
                System.out.println("查水表的 !");
                Thread.yield();
            }
            System.out.println("查水表的! Over!");
        }
    }
    static class Person2 extends Thread{
        public void run(){
            for (int i = 0; i<100; i++){
                System.out.println("你是谁?");
                Thread.yield();
            }
            System.out.println("你是谁? Over!");
        }
    }
    static class Person1 extends Thread{
        public void run(){
            for (int i = 0;i<10000;i++){
                System.out.println("做弹弓子打你家玻璃!");
                Thread.yield();
            }
            System.out.println("弹弓子! Over!");
        }
    }
}
