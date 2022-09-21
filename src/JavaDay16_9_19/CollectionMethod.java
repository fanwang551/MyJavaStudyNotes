package JavaDay16_9_19;

import java.util.ArrayList;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //添加
        arrayList.add("zhao");
        arrayList.add(10);
        arrayList.add(true);
        System.out.println(arrayList);
        //删除
        arrayList.remove(0);
        arrayList.remove(true);
        System.out.println(arrayList);
        //查找
        System.out.println(arrayList.contains(10));
        System.out.println(arrayList.isEmpty());


    }
}
