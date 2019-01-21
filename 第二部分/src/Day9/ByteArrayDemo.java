package Day9;

import Day3.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayDemo {
    public static void main (String args) throws IOException{
        byte [] buf = {5,(byte)0xff,-1};//{05,ff,ff}
        ByteArrayInputStream in =
                new ByteArrayInputStream(buf);
        int b = in.read();//5
        System.out.println(b);
        b = in.read();//255
        System.out.println(b);
        b = in.read();//255
        System.out.println(b);
        b = in.read();//-1
        System.out.println(b);
        in.close();
        //将内存中的变长 byte[] 数组作为输入流
        //BAOS 中包含一个变长Byte数组
        ByteArrayOutputStream out =
                new ByteArrayOutputStream();
        out.write(5);
        out.write(65);
        out.write("中国".getBytes("GBK"));
        out.close();
        byte [] ary = out.toByteArray();
        System.out.println(Arrays.toString(ary));
        IOUtils.print(ary);
    }
}
