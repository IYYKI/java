package Day11;


public class SyncDemo {
    public static void main (String [] args){
        Table table = new Table();
        Table.Person p1 = table.new Person();
        Table.Person p2 = table.new Person();
        p1.start();
        p2.start();
    }
}
class Table{
    int beans = 20;
    Object monitor = new Object();
    public synchronized int getBeans(){
        int a = 5;
        if (beans == 0) throw new RuntimeException("没了");
        Thread.yield();
        return beans--;
    }
    class Person extends Thread{
        public void run(){
            while (true){
                int bean = getBeans();
                System.out.println(getName()+"拿到:"+bean);
                Thread.yield();
            }
        }
    }
}
