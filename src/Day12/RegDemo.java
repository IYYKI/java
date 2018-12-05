package Day12;

public class RegDemo {
    public static void main(String [] args){
        String email = "yao.y-u.kai@mail.com";
        //email:^[\w-]+(\.[\w-]+)*@[\w]+(\.[\w]+)*$
        String reg = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*$";
        boolean pass = email.matches(reg);
        System.out.println(pass);//true

        String date = "2018年12月5日";
        date = date.replace("日","")
               .replaceAll("[年月]","-");
        System.out.println(date);//"2018-12-5"
    }
}
