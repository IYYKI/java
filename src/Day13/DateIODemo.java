package Day13;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateIODemo {
    public static void main (String [] args) throws ParseException {
        Date date = new Date();
        DateFormat fmt =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fmt.format(date);
        System.out.println(str);
        str = "2018-12-09";
        fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date d = fmt.parse(str);
        System.out.println(d);
        System.out.println(fmt.format(d));
        str = "19981219";//根据生份证号码计算生日（Date）
        //"yyyyMMdd"
        fmt = new SimpleDateFormat("yyyyMMdd");
        Date birthday = fmt.parse(str);
        //parse 方法的原理
        long n = (1998-1970)*1000L*60*60*24*365+  //年
                2*1000L*60*60*24*30+    //月
                8*1000L*60*60*24;   //日
        System.out.println(n);
        System.out.println(birthday.getTime());
    }
}
