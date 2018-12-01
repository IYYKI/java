package day10;
import cn.com.yyk.Circle;
import shape.Rectangle;
import shape.Shape;

public class CastDemo {
    public static void main(String[] args){
        Shape c = new Circle(2,2,4);
        Shape s =c;

        Shape s1 = new Circle(3,3,4);
        Circle c1 = (Circle)s1;//强制类型转换

        boolean isCircleType = s1 instanceof Circle;
        System.out.println(isCircleType);//ture

        Shape s2 = new Rectangle(2,2,3,4);
        isCircleType = s2 instanceof Circle;
        System.out.println(isCircleType);//false
        if(s2 instanceof Circle) {
            Circle s3 = (Circle) s2;//保证不会出现异常
            System.out.println("c3是一个圆！");
            Circle c3 = (Circle) s2;//出现异常
        }
    }
}

