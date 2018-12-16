package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main (String [] args){
        AccountManager mgr = new AccountManager();
        Scanner in = new Scanner(System.in);
        while (true){
            try{
                System.out.print("选择：1注册，2登陆，3查看全部，0离开：");
                String cmd = in.nextLine();
                if (cmd.equals("1")){
                   System.out.print("输入(email pwd):");
                   String str = in.nextLine();
                   String [] data= str.trim().split("\\s+");
                   String email = data[0];
                   String pwd = data[1];
                   User user = mgr.login(email,pwd);
                   System.out.println("注册成功："+user);
                }else if ("2".equals(cmd)){
                    System.out.print("输入(email pwd):");
                    String str = in.nextLine();
                    String [] data = str.trim().split("\\s+");
                    String email = data[0];
                    String pwd = data[1];
                    User user = mgr.login(email,pwd);
                    System.out.println("登陆成功："+user);
                }else if ("3".equals(cmd)) {
                    List<User> all = mgr.findAll();
                    //System.out,println(all);
                    Iterator<User> i;
                    for (i = all.iterator(); i.hasNext();) ;

                    User user = i.next();
                    System.out.println(user);
                }else if ("0".equals(cmd)){
                    System.out.println("Bye *_*!");
                    break;
                }else {
                    System.out.println("命令错误！");
                }
            } catch (EmailOrPwdException e){
                e.printStackTrace();
                System.out.println("登陆失败！"+e.getMessage());
                continue;
            }
        }
    }
}
/**帐号管理：这册，登陆，等**/
class AccountManager {
//key 是email，value 是 User实例
private HashMap<String,User>users = new HashMap<String, User>();
private int index = 1;
public User reg(String email,String pwd)throws EmailExistException{
    if (users.containsKey(email)){
        //在方法中使用throw 抛出异常实例
        throw new EmailExistException("已经注册过了！");
    }
    User user = new User(index++,email,pwd);
    users.put(email,user);
    return user;
}
//throws 是在方法上声明异常的
    //方法声明了异常，表示这个方法执行时候可能出异常
    /**登陆系统，条件是：email，pwd，结果是：登陆成功的用户.**/
    public User login(String email,String pwd)throws EmailOrPwdException{
        User someone = users.get(email);
        if (someone == null){
            throw new EmailOrPwdException("查无此人!");
        }
        if (someone.getPwd().equals(pwd)){
            return someone;//登陆成功
        }
        throw new EmailOrPwdException("密码错误！");
    }
    public List<User>findAll(){
        return new ArrayList<User>(users.values());
    }
}
class User{
    private int id;
    private String email;
    private String pwd;
    public User(){
    }
    public User(int id,String email,String pwd){
        super();
        this.id = id;
        this.email=email;
        this.pwd=pwd;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public String toString(){
        return id + ":" +email;
    }
    public boolean equals(Object obj){
        if (obj==null)
            return false;
        if (this==obj)
            return true;
        if (obj instanceof User){
            User o = (User) obj;
            return this.id==o.id;
        }
        return false;
    }
    public int hashCode(){
        return id;
    }
}
//自定义异常应该实现全部父类的构造器
    class EmailExistException extends Exception{
        public EmailExistException() {
            super();
    }
    public EmailExistException(String message,Throwable cause){
            super(message,cause);
    }
    public EmailExistException(String message){
            super(message);
    }
    public EmailExistException(Throwable cause){
            super(cause);
    }
}
class EmailOrPwdException extends Exception{
    public EmailOrPwdException(){
        super();
    }
    public EmailOrPwdException(String message,Throwable cause){
        super(message,cause);
    }
    public EmailOrPwdException(String message){
        super(message);
    }
    public EmailOrPwdException(Throwable cause){
        super(cause);
    }
}