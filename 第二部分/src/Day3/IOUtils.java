package Day3;

import java.io.*;

public class IOUtils {
    public static byte [] read (String filename)throws IOException {
        return null;
    }
    public static String toHexString(byte [] b){
        return null;
    }
    public static byte [] read(File  file)throws IOException{
        return null;
    }
    public static byte [] read(InputStream in)throws IOException{
        return null;
    }
    public static void cp(String src,String dst){
        try {
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst);
            byte [] buf = new byte[5*1024];//1k Byte
            int num;
            while ((num = in.read(buf))!=-1){
                out.write(buf,0,num);
                System.out.println("num:"+num);
            }
            in.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void cp2(String src,String dst){
        try {
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst);
            int b;
            while ((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    /**
     * 将文件内容按照16进制形式打印，每16个byte为一行
     * @param file 文件名
     */
    public static void print(String file){
        try {
            InputStream in = new FileInputStream(file);
            int b; int i =1;
            while ((b=in.read())!=-1){
                if (b<0xf)
                    System.out.print("0");
                System.out.println(Integer.toHexString(b)+" ");
                if (i++%16==0)
                    System.out.println();
            }
            System.out.println();
            in.close();
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void print(File file){

    }
    /**
     * 将ary内容按照16进制形式打印，每16个byte为一行
     * @param ary 数据
     */
    public static void print(byte [] ary){

    }
}
