package Day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCastDemo {
    public static void main (String [] args){
        long gmt = 0;//1970 1 1 00:00:00,000
        Date date = new Date();//默认是当前时间
        date.setTime(gmt);
        System.out.println(date.getYear());//70
        System.out.println(date);
        Calendar cal = new GregorianCalendar();//默认是当前时间
        cal.setTime(date);//date 转换为  cal
        System.out.println(cal.get(Calendar.YEAR));//1970
        //1969 12 31 00:00:00, 000
        cal.add(Calendar.DAY_OF_WEEK,-1);//当前时间减少一天
        //时间的计算，本质上是long类型的历法计算
        //减少一天就是： 0 - 1000L*60*60*24
        System.out.println(cal.get(Calendar.YEAR));//1969
        Date d = cal.getTime();
        System.out.println(d.getYear());//69
        long l = d.getTime();
        System.out.println(1);
        System.out.println(1000L*60*60*24);
    }
}
