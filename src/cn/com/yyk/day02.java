package cn.com.yyk;

class   VarDemo {
    public  static  void main(String[] args){
        int age;//变量的声明
        age =16;//变量的初始化，第一次赋值
        age =15;//变量赋值
        System.out.println(age);//15访问，读取变量的值
        int score = 100;//直接声明并且初始化
        System.out.println(score);//100
        if(score>80){
            int iq =100;
            System.out .println(iq);
        }
        int iq =200;
        System.out.println(iq);
    }
}
