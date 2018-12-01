package cn.com.yyk;

public class 作业2 {
    public static void main(String[]args){
        String code ="692223361219";
        System.out.println(ean(code));
        while (true) {
            System.out.println(1);
        }
    }

    public static String ean(String code){
        //code="692223361219"
        //      012345678901
        int c1 =0;
        int c2 =0;
        for (int i=0;i<12;i+=2){//0~<12 //0,2,4,6,8,..
            c1+=(code.charAt(i)-'0');
            c2+=(code.charAt(i+1)-'0');
        }

        int c = (c1+c2*3)%10;
        int cc= (10-c)%10;
        return code+cc;


    }    /**
     * 生成 EAN-13 验证码
     * 输入：692223361219
     * 输出：6922233612192
     */
}
