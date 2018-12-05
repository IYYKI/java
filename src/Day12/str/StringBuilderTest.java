package Day12.str;

import javax.swing.text.Style;

public class StringBuilderTest {
    public static void main(String[] args) {
        long time1 = testString(50000);//字符串连接
        long time2 = testStringBuilder(50000);
        System.out.println(time1 + " PK " + time2);
    }

    public static long testString(int times) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            s += "A";
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long testStringBuilder(int times) {
        long start = System.currentTimeMillis();
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < times; i++) {
            buf.append("A");
        }
        String s = buf.toString();
        long end = System.currentTimeMillis();
        return end - start;
    }
}