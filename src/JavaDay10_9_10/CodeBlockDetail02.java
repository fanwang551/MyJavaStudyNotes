package JavaDay10_9_10;
/*
class A{
public A(){
//1.super()
//2.{
  }


}
}
* */
//不是所用的父类属性加载都先于子类的
//1.父类的静态代码块和静态属性
//2.子类的静态代码块和静态属性
//3.父类的普通代码块和普通属性初始化
//4.父类的构造方法
//5.子类的普通代码和普通普通属性初始化
//6.子类的构造方法
/*结果
* etf1
father的static代码块
201
Father的普通代码块
getf2
father 构造器
201
son的普通代码块
son 构造器*/
public class CodeBlockDetail02 {
    public static void main(String[] args) {
new son();
    }

}
class Father{
    {
        System.out.println("Father的普通代码块");
    }
    private int f2=getF2();
    private static int f1=getF1();
    public  int getF2(){
        System.out.println("getf2");
        return 100;
    }
    static {
        System.out.println("father的static代码块");
    }
    public static  int getF1(){
        System.out.println("getf1");
        return 101;
    }

    public Father() {
        System.out.println("father 构造器");
    }
}
class son extends Father{
    private int s1=200;
    private static int s2=201;
    {
        System.out.println(s2);
        System.out.println("son的普通代码块");
    }
    static {
        //错误只能调用非static System.out.println(s1);
        System.out.println(s2);
    }

    public son() {
        System.out.println("son 构造器");
    }
}
