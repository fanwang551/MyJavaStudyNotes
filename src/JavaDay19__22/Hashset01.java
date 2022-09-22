package JavaDay19__22;

import java.util.HashSet;

public class Hashset01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        //1.在执行add方法后，回访回一个Boolean值
        //添加成功为true，否则为false
        //可以通过remove删除特定值
        System.out.println(hashSet.add("zhao"));
        System.out.println(hashSet.add("qian"));
        System.out.println(hashSet.add("sun"));
        //不能添加
        System.out.println(hashSet.add("sun"));
        //hashset不能添加相同的元素
        System.out.println(hashSet);
        hashSet.add(new Dog("black"));
        hashSet.add(new Dog("black"));
        System.out.println(hashSet);


        //经典案例
        hashSet.add(new String("li"));
        hashSet.add(new String("li"));//为什么加入不了？
        System.out.println(hashSet);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}