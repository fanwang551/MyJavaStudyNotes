package JavaDay10_9_10;
//创建一个对象时，在一个类中的调用顺序
//1.调用静态代码块和静态属性（多个静态代码块时，按定义顺序调用）
//2.调用普通代码块和普通属性变量（同级按顺序）
//3.调用构造方法
//构造器的前面包含了super()和普通代码块，即
/*
class A{
public A(){
//1.super()
//2.{
  }


}
}
* */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //1.调用静态代码块和静态属性（多个静态代码块时，按定义顺序调用）
        B b = new B();
      //输出顺序
        //这是B类的static调用
        //getN1被调用
        //B类的普通代码块被调用
        //getN2被调用
        //B()构造器
    }
}
class B{
    public B() {
        System.out.println("B()构造器");
    }

    {
        System.out.println("B类的普通代码块被调用");
    }
    private int n2=getN2();
    public static int getN2(){
        System.out.println("getN2被调用");
        return 200;
    }
    static {
        System.out.println("这是B类的static调用");
    }
    private static int n1=getN1();
    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }

}