package cn.com.yyk;

public class BinDemo {
    public static void main(String[] args){
        int i =15;
        System.out.println(Integer.toBinaryString(i));//1111
        i = 'A';
        System.out.println(Integer.toBinaryString(i));//1000001
        /*
        65(10) = 6*10+5*1 = 6*10^1 + 5*10^0
        1111(2) = 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0
                =1*8  +1*4  +1*2  +1*1
                =15(10)
            二进制的权：128   64  32  16  8   4   2   1
                             1   0   0   0   0   0   1
        1000001（2）= 64+1=65(10)
        11000001(2)= 128 + 64 +1 = 193(10)

        65(10) -> 1  0  0  0  0  0  0  1(2)
        192(10) -> 110000000 (2)

        16进制 0～9，a～f： 0～15   16进1
        基数： 16  权 ： 16^2 16^1 16^0 : 256 16 1
        41(16) = 4*16 + 1*1 = 65(10) = 1000001(2)
        8421 8421
        0100 0001(2)
        4    1   (16)
        c0(16) = 12*16 = 192(10)
        c    0(16)
        8421 8421
        1100 0000(2)
         */
        i=192;
        System.out.println(Integer.toBinaryString(i));//11000000
        i=0xc0;
        System.out.println(Integer.toBinaryString(i));//11000000
        i=0xffff;
        System.out.println(Integer.toBinaryString(i));//1111111111111111
        i=0xaaaa;
        System.out.println(Integer.toBinaryString(i));//1010101010101010
        i='中';//0x4e2d=='中'
        System.out.println(Integer.toBinaryString(i));//100111000101101
        i= 0x4e2d;
        System.out.println(Integer.toBinaryString(i));
        //5(1024*1024)(Byte)
        //1Byte = 8bit;  两位16进制表示
        //5M = 5*1024*1024*2 16进制字符
return;
    }
}
