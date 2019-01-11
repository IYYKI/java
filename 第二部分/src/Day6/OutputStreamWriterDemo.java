package Day6;

import Day3.IOUtils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main (String [] args) throws IOException{
        String file = "writer.txt";
        OutputStreamWriter out = new OutputStreamWriter
                (new BufferedOutputStream
                        (new FileOutputStream(file)),"utf-8");
        out.write('中');
        out.write('国');
        out.close();
        IOUtils.print(file);
    }
}
