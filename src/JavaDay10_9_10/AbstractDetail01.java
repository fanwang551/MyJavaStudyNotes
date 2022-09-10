package JavaDay10_9_10;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能被实例化
        //new E();
    }
}
abstract class D{
    public void hi(){
        System.out.println("hi");
    }
}
abstract class E{
    abstract void hello();
}
 class F {
     //抽象类不一定要包含 abstract 方法。也就是说,抽象类可以没有 abstract 方法
     //public void hi();
 }
