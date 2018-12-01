package Day11;
/**
 * 自行车，是交通工具的实现，是一种具体的交通工具
 */
public class Bicycle implements Vehicle {
    public int getType(){
        return BICYCLE;
    }
    public void run(){
        System.out.println("用腿蹬！");
    }
    public void stop(){
        System.out.println("撞墙!说对不起!");
    }
}