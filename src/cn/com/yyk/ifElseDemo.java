package cn.com.yyk;

public class ifElseDemo {
    public static void main(String[] agrs){
        int score = 98;
        if(score<100 && score>=90){
            System.out.println("优秀");
        } else if(score<90 && score>=80){
            System.out.println("良好");
        } else if(score<80 && score>=70){
            System.out.println("中等");
        } else if (score<60){
            System.out.println("不及格");
        }
    }
}
