package Day2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main (String [] args) throws IOException {
        whiteDemo();
    }
    private static void whiteDemo()throws IOException{
        OutputStream out = new FileOutputStream("test.txt");
        //写出一个int 的第八位
        out.write(65);//A
        out.write(66);
        out.write(0xd6);//中(GBK/GB2312)
        out.write(0xd0);
        out.write(0xbd);
        out.write(0xd3);
        out.write(0xbf);
        out.write(0xda);
        byte [] buf = {98,99,(byte)0xd6,(byte)0xd0};
        out.write(buf);
        out.write(buf,2,2);
        out.write("试试吧".getBytes("GBK"));
        out.close();
    }
}
