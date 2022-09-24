package JavaDay21_9_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class Collection02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("aa");
        arrayList.add("aaa");
        System.out.println(arrayList);
        Object maxObjiect= Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1,Object o2){
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println(maxObjiect);
        System.out.println(Collections.frequency(arrayList,"a"));
        ArrayList arrayList1 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add("");
        }
        Collections.copy(arrayList1,arrayList);
        System.out.println(arrayList1);
        Collections.replaceAll(arrayList,"a","A");
        System.out.println(arrayList);
    }
}
