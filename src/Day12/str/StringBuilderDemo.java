package Day12.str;

public class StringBuilderDemo {
    public static void main (String [] args){
        StringBuilder buf = new StringBuilder();
        //StringBuilder 的内部是一个使用变长算法维护的char[]
        buf.append("李敖")
                .append("的前妻胡女士是")
                .append("一个绝世美女!")
                .insert(0,"大师").delete(4,5);
        System.out.println(buf);
        String s1 = "abc";
        String s2 = "def";
        String s3 = "efg";

        //String s4 = s1=s2=s3;
        String s4 = new StringBuilder(s1)
                .append(s2)
                .append(s3)
                .toString();
        String s5 = s1;//s5 = s5+s1;
        //s5 = new StringBuilder(s5).append(s1).toString;

        StringBuilder b = new StringBuilder(s1);
        b.append(s1);
        b.append(s1);
        b.append(s1);
                b.append(s1);
    }
}
