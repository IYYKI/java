package Day12.str;

import java.util.Date;

public class WarpClassDemo {
    public static void main(String [] args) {
        Integer a = new Integer(1);
        System.out.println(a);//1
        Long l = new Long(123L);
        String str = Long.toBinaryString(192);
        System.out.println(str);//11000000
        int x = Integer.parseInt("4e2d", 16);
        System.out.println(x);//20013
        System.out.println(Integer.toHexString(15));//f

        //案例：输出一个字符串的每个字符的编码(hex)
        str = "我爱北京天安门";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(Integer.toHexString(c));
        }
            System.out.println(ascII("abc中国"));
    }
        //案例：讲一个字符串中的非ASC字符，进行转义
        //如：输入："abc中"   输出"abc\u4e2d"
        public static String ascII(String str){
        String s = "";
        for (int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            if (c<255){
                s+=c;
            }else {
                s+="\\"+Integer.toHexString(c);
            }
        }
        return s;
    }

}
