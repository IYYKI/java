package cn.com.yyk;

public class ForDemo {
    public static void main(String[] args) {
    int [] ary = {6,3,5,1,5,7};
    int sum = 0;
    for(int i =1;i<6;i+=2){
        sum+=ary[i];
        }
        System.out.println(sum);
    char [] chs ={'6','3','5','1','5','7'};
                // 0 . 1 , 2 , 3 , 4 , 5
    int sum2= 0;
    for(int i=1;i<6;i+=2){
        sum2+=(chs[i]-'0');
    }
    System.out.println(sum);
    }
}
