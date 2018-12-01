package cn.com.yyk;

public class Point {
    int x;
    int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
        Point o = new Point(0,1);
    }
    public double area (Point other){
        return Math.sqrt(x-other.x)*(x-other.x);
    }
}
