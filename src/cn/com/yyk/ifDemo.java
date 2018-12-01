package cn.com.yyk;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] agrs) {
        Scanner console = new Scanner(System.in);
        System.out.print("输入行数");
        int rows = console.nextInt();
        int size = 10;
        int pages;
        if (rows % size == 0) {
            pages = rows / size;
        } else {
            pages = rows / size + 1;
        }
        System.out.println("页数" + pages);
    }
}

    /**
     * 根据行数统计显示分页数量
     *
     * @param rows 需要显示的数据行数
     * @return 显示分页数量
     */
