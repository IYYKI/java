package Day6;

import Day3.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CharEcondingDemo {
    public static void main (String [] args)throws IOException {
        String str = "ABCDE中国";//char(unicode)序列
        System.out.println(str);
        System.out.println("UTF-16BE");
        byte [] utf16be = str.getBytes("UTF-16BE");
        String file = "utf16be.txt";//utf-16be编码的文本文件
        OutputStream out = new FileOutputStream(file);
        out.write(utf16be);
        out.close();
        IOUtils.print(file);
        System.out.println("UTF-8");
        byte [] utf8 = str.getBytes("utf-8");
        file = "utf8.txt";
        out = new FileOutputStream(file);
        out.write(utf8);
        out.close();
        IOUtils.print(file);
    }
}
