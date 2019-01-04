package Day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main (String[]args){

    }
    private static void readByBufferDemo()throws IOException{
        InputStream in = new FileInputStream("demo2.txt");
        byte [] buf = new byte[10];
        //count 是读取的数据个数：1～10 > 0,如果-1到文件尾
        int count;
        while ((count = in.read(buf))!=-1){
            System.out.println(toHexString(buf));
        }
        in.close();
    }
    private static String toHexString(byte[]ary){
        StringBuilder buf = new StringBuilder();
        for (int i = 0;i<ary.length;i++){
            byte b = ary[i];
            int a = b & 0xff;
          String hex = Integer.toHexString(b);
          buf.append(hex).append(" ");
        }
        return buf.toString();
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
