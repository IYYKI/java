package Day11;

public class VehicleDemo {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle();//错误
        Vehicle v;
        v = new Bicycle();
        v.run();
        v.stop();
    }

}