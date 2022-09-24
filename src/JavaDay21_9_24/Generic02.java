package JavaDay21_9_24;

import java.util.ArrayList;
//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，
// 或者是某个方法的返回值的类型，或者是参数类型
//编译时检查添加的数据类型
//在遍历时，可以直接Dog数据类型而不是Object
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog1> arrayList = new ArrayList();
        arrayList.add(new Dog1("white",2));
        arrayList.add(new Dog1("yellow",2));
        arrayList.add(new Dog1("black",2));

        //如果程序员不小心加入了猫对象,使用泛型后会报错
       // arrayList.add(new Cat1("Orange",3));

        for (Dog1 dog1 :arrayList) {
            System.out.println(dog1.getAge()+"_"+dog1.getName());
        }


    }
}
class Dog1{
    private String name;
    private int age;

    public Dog1(String name, int age) {
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
class Cat1{
    private String name;
    private int age;

    public Cat1(String name, int age) {
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
