package Day15.worm;

import java.util.Scanner;

public class WormDemo {
    public static void main(String[] args) {
         Node[]nodes = {new Node(4, 2),
                new Node(4, 3),
                new Node(4, 4),
                new Node(5, 4),
                new Node(6, 4),
                new Node(7, 4)};
        Worm worm = new Worm(nodes,Worm.LEFT);
        WormPane pane = new WormPane(worm);
//        worm.step();
  //      pane.print();
    //    worm.step(Worm.UP);
      //  pane.print();
        Scanner s = new Scanner(System.in);
        while (true){
            pane.print();
            String str = s.nextLine();
            if (str.trim().equals("")){
                worm.step();
            }else if (str.equalsIgnoreCase("u")){
                worm.step(Worm.UP);
            }else if (str.equalsIgnoreCase("d")){
                worm.step(Worm.DOWN);
            }else if (str.equalsIgnoreCase("l")){
                worm.step(Worm.LEFT);
            }else if (str.equalsIgnoreCase("r")){
                worm.step(Worm.UP);
            }else if (str.equalsIgnoreCase("q")){
                break;
            }

            }
        }
    }