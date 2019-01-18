package Day2;

import java.io.*;

public class BufferIODemo {
    public static void main (String [] args)
            throws IOException{
        //打开带有输入缓存的流 BufferedInputStream(BIS)
        //当取出流中的数据时候， b = in.read();BIS会将
        //数据成块的读取到内存数组，然后再读取出来
        InputStream in =
                new BufferedInputStream
                        (new FileInputStream("demo.txt"));
        int b = in.read();
        //in.skip(54);
        System.out.println(b);
        in.close();
        //创建带有输出缓存的流，BufferedOutputStream，
        // 可以为任意的流提供输出缓存区管理，写出的数据
        //先缓存到 BufferedOutputStream 的byte数组中
        //在缓存满了以后，一次性的写出到目标流里面。
        OutputStream out =
                new BufferedOutputStream
                        (new FileOutputStream("test2.txt"));
        out.write(0x41);//写出到缓存中
        //out.flush();       //强制的写出缓存到磁盘
        out.close();       //关闭流时候默认执行 flush()
    }
}
