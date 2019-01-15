package Day7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCounterDemo {
    public static void main (String [] args) throws IOException{
        String file = "src/WZ.txt";
        Map<Character,Integer> map = countAll(file,"GBK");
        int all = 0;
        Collection<Integer> values = map.values();
        for (int n : values){
            all+=n;
        }
        List<Entry<Character,Integer>> list =
                new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<Character,Integer>>(){
            public int compare(Entry<Character,Integer> o1,Entry<Character,Integer>o2){
                return -(o1.getValue()-o2.getValue());
            }
        });
        for (int i = 0;i<10;i++){
            Entry<Character,Integer> entry = list.get(i);
            char ch = entry.getKey();
            int n = entry.getValue();
            System.out.println(ch + ":"+n+" "+((double)n/all)*100);
        }
        System.out.println("不重复字符数量:"+map.size());
        System.out.println("共计字符:"+all);
    }
    public static Map<Character,Integer>
    countAll(String file,String encoding)throws IOException{
        InputStreamReader in = new InputStreamReader(new BufferedInputStream(
                new FileInputStream(file)),encoding);
        Set<Character> chs = new HashSet<Character>();
        chs.add('\n');
        chs.add('\r');
        chs.add(' ');
        chs.add(',');
        chs.add('。');
        Map<Character,Integer>map = new HashMap<Character,Integer>();
        int ch;
        while ((ch = in.read())!=-1){
            char c = (char)ch;
            if (chs.contains(c)){
                continue;
            }
            Integer n = map.get(c);
            map.put(c,n==null ? 1: n+1);
        }
        in.close();
        return map;
    }
}
