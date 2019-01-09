package Day5;

import Day3.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStreamDemo {
    public static void main (String args)throws IOException{
        String file = "data.dat";
        OutputStream out = new FileOutputStream(file);
        int n = -3;
        out.write(n >>> 24);
        out.write(n >>> 16);
        out.write(n >>> 8);
        out.write(n);
        out.close();
        IOUtils2.print(file);
        file = "data2.dat";
        out = FileOutputStream(file);
        DataOutputStreamDemo dos = new DataOutputStreamDemo(out);
        dos.writeInt(-3);
        dos.clone();
        IOUtils2.print(file);
    }

    private void writeInt(int i) {
    }
}
