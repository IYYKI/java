package shape;

interface IShape{
    public double area();
}
class square implements IShape{
    double length ;
    public square(double l){
        length = l;
    }
    public double area(){
        return length*length;
    }
}
