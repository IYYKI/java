package Day10;

public class CurrentThreadDemo {
    public static void main (String [] args){
        Thread main = Thread.currentThread();
        System.out.println(main.getId()+","+main.getName());
        eat();
        Thread t = new Thread(){
            public void run (){
                System.out.println("run():"+(this.getId()+","+this.getName()));
                eat();
            }
        };
        t.start();
    }
    public static void eat(){
        Thread t = Thread.currentThread();
        System.out.println("eat():"+t.getId()+","+t.getName());
    }
}
