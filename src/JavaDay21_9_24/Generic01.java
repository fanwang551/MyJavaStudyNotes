package JavaDay21_9_24;

import java.util.ArrayList;
//传统方法不能对加入集合中的数据类型进行约束
//遍历时需要进行类型转换，如何集合中的数据量较大，对效率有影响
//使用泛型解决
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("white",2));
        arrayList.add(new Dog("yellow",2));
        arrayList.add(new Dog("black",2));

        //如果程序员不小心加入了猫对象
        arrayList.add(new Cat("Orange",3));

        for (Object o :arrayList) {
            Dog dog=(Dog)o;
            System.out.println(((Dog) o).getName()+"_"+((Dog) o).getAge());
        }


    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}