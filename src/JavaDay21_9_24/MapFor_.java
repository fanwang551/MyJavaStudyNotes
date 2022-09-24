package JavaDay21_9_24;

import java.util.*;

@SuppressWarnings({"all"})
public class MapFor_ {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");

        //第一组 取出key
        Set keySet= map.keySet();
        //增强for
        System.out.println("增强for");
        for (Object key :keySet) {
            System.out.println(key+"_"+map.get(key));
        }
        //迭代器
        System.out.println("迭代器");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"_"+map.get(key));

        }

        //第二组 values
        Collection values= map.values();
        //增强for
        System.out.println("增强for");
        for (Object value :values) {
            System.out.println(value);
        }
        //迭代器
        System.out.println("迭代器");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value1 = iterator1.next();
            System.out.println(value1);
        }


        //第三组EntrySet

       // entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry。
        //在遍历Map对象时，先从Map对象中取出key值之后，
        // 还必须每次重复返回到Map中取得相对的值，这是很繁琐和费时的。
        //幸运的是，Map类提供了一个称为entrySet()的方法，
        // 这个方法返回一个Map.Entry实例化后的对象集。 接着，Map.Entry类提供了一个getKey()方法和一个getValue()方法。

        //增强for
        Set entrySet = map.entrySet();
        for (Object entry :entrySet) {
            Map.Entry m= (Map.Entry)entry;
            System.out.println(m.getKey()+"_"+m.getValue());
        }

        //迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            Map.Entry m= (Map.Entry)entry;
            System.out.println(m.getKey()+"_"+m.getValue());
        }
    }
}
