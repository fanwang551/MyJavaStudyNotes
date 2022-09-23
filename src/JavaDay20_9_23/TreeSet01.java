package JavaDay20_9_23;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);
            }
        });
        treeSet.add("aa");
        treeSet.add("aaa");
        treeSet.add("a");
        treeSet.add(("aaaa"));
        System.out.println(treeSet);
        TreeMap treeMap = new TreeMap();
    }
}
