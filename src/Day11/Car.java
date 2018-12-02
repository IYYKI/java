package Day11;

/**
 * 抽象的汽车，部分具体，部分抽象，
 * getType（）和run（）具体方法
 * stop（）方法没有实现，是抽象的
 * 由继承Car的类具体实现
 */
public abstract class Car implements Vehicle{
    public int getType(){
        return CAR;
    }
public void run(){
        System.out.println("给油，就跑！");
    }
}
