package Day7;

import Day3.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main (String [] args)throws IOException {
        String file = "bcy.txt";
        PrintWriter out = new PrintWriter
                (new OutputStreamWriter
                        (new FileOutputStream(file),"utf-8"));
        out.println("HI");
        out.println("我是YYK!");
        out.println("来自杭州萧山区");
        out.close();
        IOUtils.print(file);
    }
}
