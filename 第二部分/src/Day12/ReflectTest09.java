package Day12;
/**
 * 使用反射获取父类和父接口
 * **/
public class ReflectTest09 {
    public static void main (String  [] args) throws ClassCastException, ClassNotFoundException {
        Class c = Class.forName("java.lang.StringBuffer");
        //获取父类
        Class [] inter = c.getInterfaces();
        for (Class i : inter){
            System.out.println(i.getName());
        }
    }
}
