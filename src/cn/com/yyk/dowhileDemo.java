package cn.com.yyk;

import java.util.Scanner;

public class dowhileDemo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int bet;
        do {
            System.out.print("输入押注 ");
            bet = sc.nextInt();
        }while ((bet<=0)||(bet>balance));
        System.out.println(bet);
    }


}

