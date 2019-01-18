package Day1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafBufferDemo {
    public static void main (String [] args) throws IOException{
        File file = new File("demo.txt");
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        byte [] buf = new byte[5];
        //   将 文件中数据 读取到byte缓冲区，返回读取数量
        int count = raf.read(buf);
        System.out.println(count+",");
        System.out.println(Arrays.toString(buf));
        System.out.println(raf.getFilePointer());
        raf.seek(raf.length());//移动到文件尾
        raf.write(buf,1,3);//写出3个英文字符
        raf.close();
    }
    /**讲一个小文件读取到内存的byte数组中**/
    public static byte [] read(String filename) throws IOException{
        File file = new File(filename);
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        byte [] buf = new byte[(int)raf.length()];
        int count = raf.read(buf);
        raf.read(buf);
        raf.close();
        return buf;
    }
}
