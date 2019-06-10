package Day12;

import Person.Person;

import static java.lang.Class.forName;

/**
 * 获取.Class文件的Class对象
 * **/
public class ReflectTest01 {
    public static void main(String[] args) throws ClassCastException, ClassNotFoundException {
        //第一张方式
        Class clazz1 = forName("yyk.第二部分.Day12.Person");
        //第二中方式
        //每个类里面都有class 属性
        Class clazz2 = Person.class;
        //第三种方式
        //通过调用对象上的 getClass 方法获取 Class对象
        Person p = new Person();
        Class clazz3 = p.getClass();
        System.out.println(clazz1==clazz2);
        System.out.println(clazz3==clazz2);
    }
}