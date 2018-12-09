package Day13;

import jdk.nashorn.internal.runtime.ParserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SpecialDateDemo {
    public static void main (String [] args)
            throws ParseException{
            Scanner in = new Scanner(System.in);
            System.out.println("输入生产日期(年-月-日): ");
            String str = in.nextLine();
            SimpleDateFormat fmt =
                    new SimpleDateFormat("yyyy-MM-dd");
            Date create = fmt.parse(str);
            Date special = specialDate(create,3);
            System.out.println("促销日期:"+fmt.format(special));
            System.out.println(special.compareTo(create));
        }
/**
 * @param create 生产日期
 * @param months 保质期月数
 * @param return 促销日期
 */
public static Date specialDate(Date create,int months){
    Calendar cal = Calendar.getInstance();//获取当前时间
    cal.setTime(create);
    cal.add(Calendar.MONTH,months);//计算到过期时间
    cal.add(Calendar.WEEK_OF_YEAR,-2);//回退2周
    if (cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
        cal.add(Calendar.WEEK_OF_YEAR,-1);
    }
    cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
    return cal.getTime();
}
}