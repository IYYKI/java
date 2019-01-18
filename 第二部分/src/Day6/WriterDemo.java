package Day6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterDemo {
    public static void main (String [] args)throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("questions.txt"));
        out.println("1.\"同福客栈\"的老板是谁？");
        out.println("\tA.莫小贝");
        out.println("\tB.李莫愁");
        out.println("\tC.白展堂");
        out.println("\tD.佟湘玉");
        out.println("(D)");

        out.println("2.\"同福客栈\"原先老板是谁？");
        out.println("\tA.莫小贝");
        out.println("\tB.李莫愁");
        out.println("\tC.白展堂");
        out.println("\tD.佟湘玉");
        out.println("(B)");

        out.println("3.\"同福客栈\"的未来老板是谁？");
        out.println("\tA.莫小贝");
        out.println("\tB.李莫愁");
        out.println("\tC.白展堂");
        out.println("\tD.佟湘玉");
        out.println("(C)");
        out.flush();
        out.close();
    }
}
