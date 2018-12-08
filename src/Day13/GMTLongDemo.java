package Day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**GMT 时间标准*/

public class GMTLongDemo {
    public static void main (String [] args){
        long now = System.currentTimeMillis();
        long year = now/1000/60/60/24/365+1970;
        System.out.println(year);
        // long month = ?;
        //日期类 Date = GMT Long + 方法（公历历法）
        Date date = new Date(now);//创建Date对象，时间是当前时间
        // Date getYear()方法根据公历历法计算(除法) 2位数年份，
        // 从1900算起 到了2000年以后 就是3位数了！叫y2k(千年问题)
        int y = date.getYear() + 1900;
        // getMonth() 返回2位数月份，从0开始！
        int m = date.getMonth() + 1;
        System.out.println(y);//2018
        System.out.println(m);//12
        //Calendar 日历，历法.是抽象类
        //GregorianCalendar 格利高历，包含公历历法算法
        //任何日期类型的默认值都是当前时间(long)
        Calendar cal = new GregorianCalendar();
        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH)+1;
        System.out.println(y);//2018
        System.out.println(m);//12
    }
}
