package cn.com.yyk;

import java.util.Scanner;

public class 作业1 {//题目:
    //判断航班日期，给定一个boolean数组，长度为7.从下标0位置
    //到下标6的位置分别代表周日、周一至周六。
    // 数组中对应元素为true代表今日有航班，为false代表今日无航班。
    //实现方法isHasAirline，参数为char c，
    //代表想查询的日期，返回值为boolean类型，
    //代表参数传入的查询日期那一天是否有航班。
    //要求参数既支持传入字符'0'到'6'，
    //又要支持传入字符'日'到'六'的查询
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("输入星期");
        char day = console.nextLine().charAt(0);
        if (hasAirline(day)){
            System.out.println("有航班!");
        }else
            System.out.println("没有航班!");
    }
    public static boolean hasAirline(char day){
        boolean[] date={false,true,false,true,false,true,false};//长度为7，从下标0到6的位置分别代表
                      //  0  ,  1 ,  2  ,  3 ,  4  ,  5 ,  6
        int i =parseDay(day);//日->0,一/1->1
        return date[i];
    }
    public static int parseDay(char day){
        int d =0;
        switch (day){
            case '日': day=0;break;
            case '一': case'1':d = 1;break;
            case '二': case'2':d = 1;break;
            case '三': case'3':d = 1;break;
            case '四': case'4':d = 1;break;
            case '五': case'5':d = 1;break;
            case '六': case'6':d = 1;break;
            default:new IllegalAccessException("错误");
        }
        return d;
    }
    /**
     *
     * @param day 参数为char 掉膘想查询的日期
     *            （日，一，二，1，2···）
     * @return 代表参数传入的查询日期那一天是否有航班
     */
}
