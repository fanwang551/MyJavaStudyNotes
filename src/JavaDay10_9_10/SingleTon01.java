package JavaDay10_9_10;
//懒汉式的单例模式
//使用单例模式
//1.仍然构造器私有化
//2.定义一个static静态属性对象
//3.提供一个public方法返回一个Dog对象
//4.懒汉式，只有当用户使用getInstance时才会返回对象，后面再次调用时
//会返回上次创建的对象，从而保证单例
//区别：创建对象的时机不同
//饿汉式存在；浪费资源问题
//懒汉式存在线程安全问题
//经典单例模式：Java.lang.RunTime

public class SingleTon01 {
    public static void main(String[] args) {
        Dog instance=Dog.getInstance();
        System.out.println(instance);
        Dog instance1=Dog.getInstance();
       System.out.println(instance1);
        System.out.println(instance==instance1);
     //  new Dog("ww");
    }
}
//希望在程序通行过程中，只能创建一个dog对象
//使用单例模式
//1.仍然构造器私有化
//2.定义一个static静态属性对象
//3.提供一个public方法返回一个Dog对象
//4.懒汉式，只有当用户使用getInstance时才会返回对象，后面再次调用时
//会返回上次创建的对象，从而保证单例
class Dog{
    private String name;
    private static Dog dog;
   // private static Dog dog1=new Dog("加菲");
    private  Dog(String name) {
        this.name = name;
    }
    public static Dog getInstance(){
        if(dog==null){
            dog=new Dog("加菲");
        }
        return dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}