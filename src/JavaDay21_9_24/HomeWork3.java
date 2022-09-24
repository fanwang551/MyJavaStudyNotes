package JavaDay21_9_24;

import javax.jws.soap.SOAPBinding;
import java.util.*;
import java.util.Collections;

@SuppressWarnings({"all"})
public class HomeWork3 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("zhao",2000);
        hashMap.put("sun",3000);
        hashMap.put("li",4000);
        hashMap.put("li",3000);
        System.out.println(hashMap);
        Set keySet=hashMap.keySet();
        for (Object key :keySet) {
            hashMap.put(key,(Integer)hashMap.get(key)+100);

        }
        System.out.println(hashMap);
        Set entrySet= hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry =  iterator.next();
           Map.Entry m= (Map.Entry)entry;
            System.out.println(m.getKey()+"_"+m.getValue());

        }
        Collection values=hashMap.values();
        for (Object value :values) {
            System.out.println(value);
        }



    }

}
