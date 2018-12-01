package day10.abs;

public class Rect extends Shape{
    private int width;
    private int height;

    public Rect(int whith,int height){
        this.height=height;
        this.width=width;
    }

    public double area(){
    return  width*height;
    }
}
