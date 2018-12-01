package cn.com.yyk.review;
import java.util.Scanner;
public class Lianxi3 {
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        System.out.print("输入行数 ");
        int yeshu =console.nextInt();
        int zishu=10;
        int pages;
        if(yeshu%zishu == 0){
            pages = yeshu/zishu;
        }else{
            pages = yeshu/zishu+1;
        }
        System.out.print("页数"+pages);
        System.out.print(coutPages(yeshu));
    }

    public static int coutPages(int yeshu){
        int zishu = 10;
        int pages = yeshu/zishu+1;
        if (yeshu%zishu==0)
            pages--;
        return pages;
    }
}
