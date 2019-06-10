package Day12;

import static java.lang.Class.forName;

/**
 * 使用反射将.Class 文件读取到内存里面
 * **/
public class ReflectTest02 {
    public static void main (String [] args) throws ClassNotFoundException {
        Class clazz = forName("Day12.reflect.Person");
        System.out.println(clazz.getName());
    }
}
