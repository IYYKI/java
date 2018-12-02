package Day11;


import cn.com.yyk.Point;

public class PointDemo {
    public static void main(String [] args){
        Point p = new Point(1,2);
        System.out.println(p);//1,2
        System.out.println(p.toString());
        Point p1 = new Point(1,2);
        System.out.println(p=p1);//false
        System.out.println(p.equals(p1));
    }
}
