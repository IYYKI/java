package Day9;

import java.util.Random;
import java.util.Scanner;

public class IOBlockDemo {
    public static void main (String [] args){
        Thread t = new Thread(){
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println("线程" +t.getName() +"启动");
                Scanner in = new Scanner(System.in);
                System.out.println("发生线程 IO Block");
                int n = in.nextInt();
                System.out.println("IO 完成! n:"+n);
                Random random = new Random();
                n = random.nextInt();
                System.out.println(n);
            }
        };
        t.start();
    }
}
