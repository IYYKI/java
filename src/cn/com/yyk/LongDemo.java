package cn.com.yyk;

public class LongDemo {
    public static void main(String[] args) {
        long max;
        max = 0x7fffffffffffffffL;
        long years = max / 1000 / 60 / 60 / 24 / 365;
        System.out.println(years);
        long now = System.currentTimeMillis();
        long year = 1970 + (int) (now / 1000 / 60 / 60 / 24 / 365);
        System.out.println(years);
        long l = 1024L * 1024 * 1024 * 4;
        System.out.println(Long.toBinaryString(l));
        double d = 5D / 2;
        System.out.println(d);//2.5
        int i = 2%5;
        System.out.print(i);
        /*
        0%5  0
        1%5  1
        2%5  2
        3%5  3
        4%5  4
        5%5  0
        6%%  1
        ... ...
         */

        int r =(int)(System.currentTimeMillis()%5);
        System.out.print("r="+r);
    }
}