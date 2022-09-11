package JavaDay10_9_10;
//如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法，除非它也申明为abstract
//抽象方法不能使用private，final和static来修饰，因为这些关键字都是和重写相违背的
public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能被实例化
        new EE().hello();

    }
}
abstract class D{
    public void hi(){
        System.out.println("hi");
    }
}
abstract class E{
    public  abstract void hello();
}
 class F {
     //抽象类不一定要包含 abstract 方法。也就是说,抽象类可以没有 abstract 方法
     //public void hi();
 }
//如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法
class EE extends E{
    @Override
    public void hello() {
        System.out.println("hello");
    }
}