package Day6;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question {
    private int id;
    private String text;
    private List<String> options = new ArrayList<String>();
    private char answer;

    public Question(){

    }
    public char getAnswer() {
        return answer;
    }
    public void setAnswer(char answer){
        this.answer = answer;
    }

    public int getId() {
        return id;
    }
    public void setId(int id ){
        this.id = id;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(id).append(" ").append("text").append("\n");
         //   for (Iterator i = options.iterator();i.hasNext(););
         //   String o = (String)i.next();
        //}
         for (String o : options){
        buf.append(o).append("\n");
        }
        return buf.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj instanceof Question){
            Question o = (Question) obj;
        }
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return id;
    }
}
