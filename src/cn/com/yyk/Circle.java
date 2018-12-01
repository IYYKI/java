package cn.com.yyk;

import shape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(int i, int i1, int i2){
        this.radius=0;
    }

    public Circle(double r){
        this.radius=r;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    void disp(){
        System.out.println("圆的半径是"+this.radius);
        System.out.println("圆的面积是"+this.getArea());
        System.out.println("圆的周长是"+this.getPerimeter());
    }

}
