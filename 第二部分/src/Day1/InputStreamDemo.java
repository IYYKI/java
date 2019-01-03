package Day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main (String[]args){

    }
    public static void readDemo(String filename)throws IOException{
        InputStream in = new FileInputStream("demo.txt");
        //读取文件，的一个byte，无符号填充到 int 的低八位
        //返回值：0x000000ff ~ 0x00000000
        //如果读到文件尾，返回-1
        int b = in.read();
        System.out.println(b);//a
        b = in.read();
        System.out.println(b);//b
        b = in.read();
        System.out.println(b);//c
        b = in.read();
        System.out.println(b);//-1
        in.close();
    }
}
