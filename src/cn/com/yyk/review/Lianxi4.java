package cn.com.yyk.review;
import java.util.Scanner;
public class Lianxi4 {
    public static  void zxc(String[]args){
        Scanner sc = new Scanner(System.in);
        int b = 1000;
        int z ;
        do {
            System.out.print("输入押注 ");
            z = sc.nextInt();
            }while ((b<=0)||(z>b));
        System.out.println(z);

    }
}
