package JavaDay19__22;

import java.util.HashMap;

public class Map_ {
    //特点
    //1.map与collection并列存在，用于保存具有映射关系的数据 key-value 双列元素
    //2.map中的key与value可以时任何引用数据类型的数据，会封装到HasHSetMapNode对象中
    //3.map中的key不允许重复，原因和hashset一样
    //map中的value可以重复
    //5. Map 的 key 可以为 null, value 也可以为 null ，注意 key 为 null,
    // 只能有一个，value 为 null ,可以多个
    //6. 常用 String 类作为 Map 的 key
    // 7. key 和 value 之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1","1");
        hashMap.put("no2","2");
        hashMap.put("no2","2");
        hashMap.put(null,null);
        hashMap.put(null,3);//key 为null只能有一个
        hashMap.put(3,null);
        System.out.println(hashMap.get("no1"));

        System.out.println(hashMap);
    }
}
