package JavaDay10_9_10;
//类被加载的情况举例
// 1. 创建对象实例时(new)
//2.创建子类对象时(先加载父类后加载子类）
//3.使用类成员变量时
//static代码块是类加载是执行，只会执行一次；普通代码块是在创建对象时调用，创建一次调用一次

public class CodeBlockDetail {
    public static void main(String[] args) {
        //类被加载的情况举例
        // 1. 创建对象实例时(new)
        //Detail detail = new Detail();
        //2.创建子类对象时(先加载父类后加载子类）
       // Father_Detail father_detail = new Father_Detail();
        //3.使用类成员变量时
        //System.out.println(new Cat().n1);

        //只会输出一次static;
        //输出两次普通代码块
        AA aa = new AA();
        AA aa1 = new AA();

    }
}
class Cat{
    public static int n1=100;//静态属性
    static {

        System.out.println("Cat 的静态代码块被执行");
    }
}
class Detail{
    //static代码块作用是对类进行初始化。随着类的加载而执行，并且只会执行一次
    //如果是普通代码块只要创建对象就会执行
    static{
        System.out.println("detail 1 静态代码执行");
    }
}
class Father_Detail extends Detail{
    static{
        System.out.println("father_detail  静态代码执行");
    }
}
class AA{
    static {
        System.out.println("AA的static被调用");
    }
    {
        System.out.println("AA的普通代码块被调用");
    }
}
