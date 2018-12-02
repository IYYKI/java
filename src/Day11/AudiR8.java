package Day11;

/**
 * AudiR8 是汽车也是跑车
 */
public class AudiR8 extends Car implements Roadster,Vehicle{
    public int getMaxSpeed(){
        return 380;
    }
    public void stop(){
        System.out.println("能量回收式刹车");
    }
}
