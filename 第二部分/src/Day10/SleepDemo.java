package Day10;

public class SleepDemo {
    public static void main (String [] args)
            throws InterruptedException{
        Thread t = new Thread(){
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println("执行线程:"+t.getName());
                try{
                    Thread.sleep(1000);
                    System.out.println("休眠结束:"+t.getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                    System.out.println("睡呀！");
                }
            }
        };
        t.start();
        Thread.sleep(500);
        t.interrupt();
        System.out.println("main 结束");
    }
}
