package Day8;

import java.util.Arrays;

public class CopyDemo {
    public static void main (String [] args){
        String [] ary = {"Tom","Jerry"};
        String [] ary1 = Arrays.copyOf(ary,ary.length);
        String [] ary2 = (String[]) IOUtils.deepCopy(ary);
        System.out.println("浅层复制:");
        System.out.println(ary==ary1);//false
        System.out.println(ary[0]==ary1[0]);//true
        System.out.println("深层复制:");
        System.out.println(ary==ary2);//false
        System.out.println(ary[0]==ary2[0]);//false

    }
}
