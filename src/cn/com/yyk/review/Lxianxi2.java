package cn.com.yyk.review;
import java.util.Scanner;

public class Lxianxi2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int shuzhi = 800;
        int bet;
        do {
            System.out.print("输入金额 ");
            bet = sc.nextInt();
        }while((bet<=0)||(bet>shuzhi));
        System.out.println(bet);


    }
}
