package Day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main (String [] args)
            throws ParseException{
        SimpleDateFormat fmt =
                new SimpleDateFormat("yyyy-MM-dd");
        String str = "2018-12-15";
        //parse 方法声明了可能会出现异常，
        //如果调用了有异常声明的方法，就必须处理异常
        Date date = fmt.parse(str);//不会出现异常
        System.out.println(date);
        date = fmt.parse("20181215");//会出现异常，可是不正确
        System.out.println(date);//会出现异常，当前块以后的语句不执行了
    }
}
