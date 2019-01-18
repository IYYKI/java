package Day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 输入流演示代码
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        byte[] buf = read("demo_utf16be.txt");
        System.out.println(toHexString(buf));
        buf = read("demo_gbk.txt");
        System.out.println(toHexString(buf));
    }
        public static byte[] read (String filename)throws IOException {
            InputStream in = new FileInputStream(filename);
            byte[] buf = new byte[in.available()];
            in.read(buf);
            in.close();
            return buf;
        }
        public static String toHexString ( byte[] buf){
            //[00 00 00 41]->00000041
            char[] cs = new char[buf.length*2];
            int idx = 0;
            Arrays.fill(cs, '0');
            for (byte b : buf) {
                String hex = Integer.toHexString(b&0xff);
                //System.out.println(idx+(2-hex.length()));
                //System.out.println(cs);
                System.arraycopy(hex.toCharArray(),0,
                        cs,idx+(2-hex.length()),hex.length());
                idx += 2;
            }
            return new String(cs);
        }
}