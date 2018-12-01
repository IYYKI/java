package shape;

import cn.com.yyk.Point;

public class Rectangle extends Shape {
    private Point location;

    private  int width;

    private  int height;
    public Rectangle(Point location, int width,int height){
        this.location=location;
        this.height=height;
        this.width=width;
    }

    public Rectangle(int i, int i1, int i2, int i3) {

    }

    public double area(){
        return width*height;
    }
}
