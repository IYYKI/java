package Day4;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo2 {
    public static void main (String [] args)throws IOException{
        File file = new File("raf_demo.dat");
        if (! file.exists()){
            file.createNewFile();
        }
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        raf.writeInt(65);//输出一个整数到流中
        raf.writeLong(65);//输出一个long到流中
        raf.write("中国".getBytes("gbk"));//输出一个GBK编码到流中
        System.out.println(raf.getFilePointer());//16
        raf.seek(0);//移动文件指针，到首部
        byte[] buf = new byte[(int)raf.length()];
        raf.read(buf);//读取文件全部内容到缓冲区
        printHex(buf);//输出文件内容
        raf.close();//关闭文件
    }
    private static void printHex(byte[] buf) {
        for (byte b : buf) {
            String hex = Integer.toHexString(b&0xff);
            System.out.print(hex+ " ");
        }
        System.out.println();
    }
}
