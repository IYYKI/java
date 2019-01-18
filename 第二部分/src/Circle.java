public class Circle extends Shape {
    int r;
    public Circle(){
    }
    public Circle(Point center,int r){
        this.location = center;
        this.r = r;
    }
    public Circle(int x,int y,int r){
        this(new Point(x,y),r);
    }
    public double area(){
        return Math.PI * r * r;
    }
    public boolean contatins(int x,int y){
        return this.location.distance(x,y)<=r;
    }
}
