package JavaDay19__22;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
        
        //第一组：先取出所以的key 通过key找出对应的value
        Set keyset = map.keySet();
        //增强for
        System.out.println("---第一种方式-----");
        for (Object key :keyset) {
            System.out.println(map.get(key));
        }
        //迭代器
        System.out.println("----第二种方法------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(map.get(key));



            //第二组：把所有的value取出
            Collection values = map.values();
            //可以使用所有collection的遍历方法
            //增强for
            for (Object value :values) {
                System.out.println(value);
            }


            //迭代器
            Iterator iterator1 = values.iterator();
            while (iterator1.hasNext()) {
                Object value =  iterator1.next();
                System.out.println(value);

            }

             //第三组 通过EntrySet 获取k-v
            Set entrySet = map.entrySet();
            //增强for
            System.out.println("---使用entrySet的增强for");
            for (Object entry :entrySet) {
                Map.Entry m=(Map.Entry)entry;
                System.out.println(m.getKey()+"-"+m.getValue());


                //迭代器
                Iterator iterator2 = entrySet.iterator();
                while (iterator2.hasNext()) {
                    Object entry1 =  iterator2.next();
                    Map.Entry m1=(Map.Entry)entry;
                    System.out.println(m.getKey()+"---"+m.getValue());

                }

            }

        }

    }
}
