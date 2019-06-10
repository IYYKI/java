package Person;

public class Person {
    private String name;
    public Person(){
        System.out.println("Person类的构造方法");
    }
    public Person(String name){
        this.name = name;
    }
    public void sing(){
        System.out.println("唱歌");
    }
}
