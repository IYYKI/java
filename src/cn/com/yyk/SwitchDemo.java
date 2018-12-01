package cn.com.yyk;


public class SwitchDemo {
    public static void main(String[] args) {
        int score = 96;
        String chengji = "不及格";
        switch (score / 10) {
            case 10: case 9: chengji = "优秀";
                break;
            case 8: chengji = "良好";
                break;
            case 7: chengji = "中等";
                break;
            default: chengji = "不及格";
        }
        System.out.println(chengji);
        System.out.print("输入星期:");
        char weekName = '日';//日->0,一->1,二->2
        int day = 1;
        System.out.println(day);
        boolean[] dates =
                {false, true, false, true, false, true, false};
        if (dates[day]) {
            System.out.println("有航班");
        } else {
            System.out.println("没有航班");
        }
    }
}
