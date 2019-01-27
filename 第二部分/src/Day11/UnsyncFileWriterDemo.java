package Day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class UnsyncFileWriterDemo {
    public static void main (String args) throws IOException{
        String  file = "unsync.txt";
        final Scanner console = new Scanner(System.in);
        final PrintWriter out = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream(file)));
        final LinkedList<String> buf = new LinkedList<String>();
        final Thread writer = new Thread(){
            public void run(){
                while (true){
                    if (buf.isEmpty()){
                        try{
                            System.out.println("无数据，休眠...");
                            Thread.sleep(5000);
                            continue;
                        }catch (InterruptedException e){
                            e.printStackTrace();
                            continue;
                        }
                    }
                    String str = buf.removeFirst();
                    System.out.println("写入："+str);
                    out.println(str);
                    out.flush();
                }
            }
        };
        writer.setDaemon(true);
        final Thread reader = new Thread(){
            public void run(){
                while (true){
                    String str = console.nextLine();
                    buf.addLast(str);
                    if (str.equals("q")){
                        writer.interrupt();
                        break;
                    }
                }
            }
        };
        writer.start();
        reader.start();
    }
}
