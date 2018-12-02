package Day11;
/**
 * 交通工具概念
 */
public interface Vehicle {
    public static final int CAR=0;
    int BICYCLE=1;
    int BUS = 2;
    /**当前交通工具的类型，0代表汽车，
     * 1代表自行车，2，代表共汽车*/
    public abstract int getType();
    void run();
    void stop();
}
