package cn.com.yyk;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
    System.out.print("输入星期：");
        Scanner console = new Scanner(System.in);
    String str = console.nextLine();
    char weekName = str.charAt(0);
    System.out.println(parseDay(weekName));
    }
    public static int parseDay(char name){
        int day = 0;
        switch (name){
            case '0' : day=0;break;
            case '1' : day=1;break;
            case '2' : day=2;break;
            case '3' : day=3;break;
            case '4' : day=4;break;
            case '5' : day=5;break;
            case '6' : day=6;break;
}
        return day;
    }
}
