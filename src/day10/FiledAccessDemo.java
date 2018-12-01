package day10;



/**
 * 属性是静态绑定到变量类型
 * 方法是动态绑定，有最终对象类决定
 */
public class FiledAccessDemo {
    public static void main(String [] args){
        Student wang = new Student();
        Person one = wang;
        System.out.println(wang.age+","+wang.getA());//2,2
        System.out.println(one.age+","+one.getA());//1,2
    }
}
class Person{
    int age =18;
    public int getA(){ return age; }
}
class Student extends Person {
    int a = 20;
    public int getA() { return super.age;}
}