package Day4;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo {
    public static void main (String [] args)throws IOException{
        String file = "raf.demo";
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        //raf.write(-2);
        raf.writeInt(-2);//将-2序列化为4个byte写入到文件中
        raf.writeLong(-2L);
        raf.writeDouble(Math.PI);
        raf.seek(0);
        int b;
        while ((b = raf.read()) !=-1){
            if (b <= 0xf){
                System.out.println("0");
            }
            System.out.println(Integer.toHexString(b)+" ");
        }
    }
}
