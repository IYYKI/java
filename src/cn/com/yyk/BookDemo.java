package cn.com.yyk;
import java.awt.print.Book;

    public class BookDemo {
        private static Book book1;

        public static void main (String[] args){
            Book book = new Book();
            String bookName = "山楂树之恋";
            System.out.println(bookName);

            book1 = new Book();
            Book book2=book1;
            String book1="月子";
            System.out.println(book1);

            book = null;
            System.out.println(book);//异常  空指针异常
        /*
        Dog myDog=new Dog();
        myDog.color = "red";
        Dog wangCai = myDog;
        System.out.println(wangCai.color);//red
         */
        }
    }

