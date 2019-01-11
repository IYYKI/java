package Day6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main (String [] args) throws IOException{
        String file = "gbk.txt";
        InputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in,"utf-8");
        int c;
        while ((c = reader.read()) != -1){
            System.out.print((char)c);
        }
        reader.close();
    }
}
