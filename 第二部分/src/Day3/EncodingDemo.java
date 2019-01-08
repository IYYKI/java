package Day3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EncodingDemo {
    public static void main (String [] args)throws IOException{
        printFile("demo_gbk.txt");
        printFile("demo_utf16be.txt");
    }
    /**
     * 按照16进制的方式输出文件内容
     * @param filename 文件名
     * **/
    public static void printFile(String filename)throws IOException{
        File file = new File(filename);
        RandomAccessFile raf = new RandomAccessFile(file,"r");
        byte [] buf = new byte[(int)file.length()];
        int size = raf.read(buf);
        printHex(buf);//将byte 数组安装 hex 进制的形式打印
        String str = new String(buf,"gbk");
        System.out.println(str);
        System.out.println("file size:"+size);
    }
    private static void printHex(byte[] buf) {
        for (byte b : buf) {
            String hex = Integer.toHexString(b&0xff);
            System.out.print(hex+ " ");
        }
        System.out.println();
    }
}
