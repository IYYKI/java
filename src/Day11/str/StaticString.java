package Day11.str;

public class StaticString {
    public static void main(String [] args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ab"+"c";
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//true
        String s4 = new String("abc");
        System.out.println(s1==s4);//false

    }
}
