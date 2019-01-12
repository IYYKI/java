package Day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main (String [] args)throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("questions.txt"));
        String str;
        while ((str = in.readLine())!= null){
            System.out.println(str);
        }
        in.close();
    }
}
