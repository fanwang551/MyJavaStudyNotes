package JavaDay20_9_23;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class Collection01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("aa");
        arrayList.add("aaa");
        System.out.println(arrayList);

        Collections.reverse(arrayList);
    System.out.println(arrayList);

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(arrayList);
            System.out.println(arrayList);
        }

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1,Object o2){
                return((String) o2).length()-((String) o1).length();
            }
        });
        Collections.swap(arrayList,0,1);
        System.out.println(arrayList);
    }
}
