package cn.com.yyk;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1000) {
            System.out.println(i++ % 4);
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
