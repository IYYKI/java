package Day11;

public class StringDemo {
    public static void main(String [] args){
        String s1 = "abc";
        String s2 = s1;
               s1+= "def";
               System.out.println(s1);//abcdef，s1引用新对象
                System.out.println(s2);//abc,"abc"对象永远不变
                 System.out.println(s1==s2);//false s1和s2地址不同

            String s3 = s1.concat("123");
            System.out.println(s1);
            String s4 = s3.toUpperCase();//<-----UpperCase大写
            System.out.println(s4);
            //s3.toString();
                         //0123456
            String s5 = "abcdabcde";
            System.out.println(s5.indexOf("c"));
            System.out.println(s5.indexOf("c",3));
            String file = "photo.jpg.bak";
            if (file.indexOf(".jpg")>-1){
                System.out.println("图片文件");
            }
            if (file.endsWith(".jpg")){
                System.out.println("jpg图片文件");
            }
            String name = file.substring(0,9);
            System.out.println(name);//photo.jpg
            String ext = file.substring(file.lastIndexOf("."));
            System.out.println(ext);
            String login = " \t\notm\r";
            login = login.trim();
            System.out.println(login);//tom

    }
}
