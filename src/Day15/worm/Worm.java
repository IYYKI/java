package Day15.worm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*** 蛇，包含节点*/
public class Worm {
    private List<Node> body = new ArrayList<Node>();
                                             // i, j
    public static final int UP=-10;          // 0,-1
    public static final int DOWN=10;         // 0, 1
    public static final int LEFT=-1;         //-1, 0
    public static final int RIGHT=1;         // 1, 0



    /*** 当前方向*/
    private int dir = -1;

    public Worm(){

    }
    public Worm(Node [] nodes){
        List<Node> list = Arrays.asList(nodes);
        body.addAll(list);
        this.dir = dir;
    }

    public Worm(Node nodes, int left) {
    }

    /*** 走一步*/
    public void step(){
        Node head = body.get(0);
        int i = head.getI() + dir/10;
        int j = head.getJ() + dir%10;
        Node newHead = new Node(i,j);
        body.add(0,newHead);
        if (eatSomething()){
            return;
        }
        body.remove(body.size()-1);
    }

    private boolean eatSomething() {
        return false;
    }

    /*** 走一步*/
    public void step(int dir){
        if (this.dir+dir==0){
            throw new IllegalArgumentException("方向错误！");
        }
      this.dir = dir;
      step();
    }
    public boolean contains(int i, int j){
        for (int idx=0;idx<body.size();idx++){
            Node n = body.get(idx);
            if (n.getI()==i && n.getJ()==j){
                return true;
            }
        }
        return false;
    }
}
