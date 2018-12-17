package Day17;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
    public static void main (String [] args) throws IOException{
        //new File(".")在内存中创建一个对象，并不是在文件系统上创建目录或文件
        File dir = new File(".");
        //get CanonicalPath()获取标准的决定路径名
        String pathname = dir.getCanonicalPath();
        //在Eclipse中，当前目录是"项目文件夹"
        System.out.println(pathname);//_pwd_
        //在内存中创建一个File对象，不代表在文件系统上创建目录文件
        //new File(dir,"demo")第一个参数的父目录
        File demo = new File(dir,"demo");
        File file = new File(demo,"file.dat");
        //可以利用File API方法检测这个文件/目录是否存在
        System.out.println(demo.exists());//false ls .|grep demo
        if (!demo.exists()){
            demo.mkdir();//在文件系统创建文件夹 mkdir demo
        }
        System.out.println(demo.exists());//true
        if (!file.exists()){
            file.createNewFile();//在文件系统创建新空白文件
        }
        long create = demo.lastModified();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd   HH:mm");
        System.out.println(fmt.format(new Date(create)));
        System.out.println(demo.isFile());//false
        System.out.println(demo.isDirectory());//true
        System.out.println(demo.canRead());//true
        System.out.println(demo.canWrite());//true
        System.out.println(demo.isHidden());//false
        System.out.println(demo.length());//文件长度 long
        System.out.println(demo.getName());//文件名
        System.out.println(demo.getParent());//..父目录
        System.out.println(demo.getParentFile());//..父目录
        //getCanonicalPath()返回规范的路径名，不会有"."
        System.out.println(demo.getParentFile().getCanonicalPath());//..父目录
        file.delete();//rm
        demo.delete();//rm
    }
}
