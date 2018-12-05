package Day12;

import cn.com.yyk.Point;

import java.util.Scanner;

public class ReadPointDemo {
    public static void main(String[] args) {
        Point p = readPoint();
        System.out.println(p);
    }

    public static Point readPoint() {
            Scanner console = new Scanner(System.in);
            while (true){
            System.out.print("输入坐标： ");
            String location = console.nextLine();
            String reg = "^\\d+[,\\s]\\s*\\d+$";//34,5
            if (location.matches(reg)) {
                String[] data = location.split("[,\\s]\\s*");
                int x = Integer.parseInt(data[0]);//"34"->34
                int y = Integer.parseInt(data[1]);
                return new Point(x, y);
            }
        }
    }
}