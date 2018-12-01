package cn.com.yyk;

public class LogicalDemo {
    public static void main(String[] args) {
        int age = 12;
        char sex = '男';
        boolean isChild = age < 14;
        boolean isMan = sex == '男';
        boolean isGirl = isChild && isMan;
        boolean isBoy = isChild && isMan;
        boolean isKid = isBoy || isGirl;
        System.out.print(age);
        }
    }