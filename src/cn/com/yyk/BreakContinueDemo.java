package cn.com.yyk;

public class BreakContinueDemo {
    public static void main(String[] args) {
        char[] chs = {'据', '传', '说', '胡', '主', '席','讲'};//找出'胡'字的位置
                     // 0,   1,    2,    3     5,   6
        int i =0;
        for (;i <6; i++) {
            if (chs[i] == '胡')
            System.out.println(i);{
                continue;
            }
            }
        }
    }



