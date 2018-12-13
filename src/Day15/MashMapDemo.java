package Day15;

import java.util.HashMap;
import java.util.Map;

public class MashMapDemo {
    public static void main (String [] args){
        Map users = new HashMap();
        users.put("john",new User("john","123"));
        users.put("tom",new User("tom","123"));
        users.put("jerry",new User("jerry","123"));
        users.put("robin",new User("robin","123"));
        //User u = (User)users.get("john");
        String name = "tom";
        String pwd = "1234";
        if (!users.containsKey(name)){
            System.out.println("无此用户！");
            return;
        }
        User u = (User) users.get(name);
        //if (u == null)
        //System.out.println("无此用户");
        if (!u.pwd.equals(pwd)){
            System.out.println("密码错误！");
            return;
        }
        System.out.println("欢迎您:"+u.name);
    }
}
class User{
    String name;
    String pwd;
    public User(String name,String pwd){
        this.name = name;
        this.pwd = pwd;
    }
}