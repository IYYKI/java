package Day15.worm;
/**
 * 蛇的节点
 */
public class Node {

        private int i;//横向位置
        private int j;//纵向位置
    public Node(){
    }

    public Node(int i,int j){
        super();
        this.i = i;
        this.j = j;
    }
    public int getI(){
        return i;
    }
    public void setI(int i){
        this.i = i;
    }
    public int getJ(){
        return j;
    }
    public void setJ(int j){
        this.j = j;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null)
            return false;
        if (this==obj)
            return true;
        if (obj instanceof Node){
            Node other = (Node)obj;
            return i==other.i && j==other.j;
        }
        return false;
    }
    @Override
    public int hashCode(){

        return i*10000+j;
    }
    @Override
    public String toString(){
        return "#";
    }

}
