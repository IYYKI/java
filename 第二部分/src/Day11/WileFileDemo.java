package Day11;

import java.io.*;
import java.util.Scanner;

public class WileFileDemo {
    public static void main (String [] args)
            throws IOException{
        String file = "sync.txt";
        PrintWriter out =
                new PrintWriter(new OutputStreamWriter(new
                        FileOutputStream(file)));
        Scanner in = new Scanner(System.in);
        while (true){
            String str = in.nextLine();
            out.println(str);
            if (str.equals("quit")){
                break;
            }
        }
        out.close();
    }
}
