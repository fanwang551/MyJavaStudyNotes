package JavaDay10_9_10;
//final细节
//1.final修饰的属性必须赋初值，并且以后不能更改，赋值的位置
//定义时
//在构造器中
//在代码块中
//2.如果final修饰的属性是静态的，则初始化的位置是 1，定义时；2在静态代码块不能在构造器中赋值。
//3.如果类不是final类，但是含有final 方法，则该方法虽不能重写，但可以被继承
//4.final不能修饰构造器
//5.final和static往往搭配使用，不会导致类加载底层编译器做不了优化
//6.包装类（integer double float boolean等都是final）
public class Final_Learn {
    public static void main(String[] args) {

    }

}
class FF{
    //定义时
    public final double TAX_RATE=0.08;
    public final double TAX_RATE1;
    public final double TAX_RATE2;
    public final double TAX_RATE3=1;
    //构造器
    public FF(double TAX_RATE1) {
        this.TAX_RATE1 = TAX_RATE1;
    }
    {
        TAX_RATE2=11;
    }
    /*如果final修饰的属性是静态的，则初始化的位置是
    1，定义时；2在静态代码块不能在构造器中赋值。
    static {
        TAX_RATE3=1;
    }*/
    final static int n=1;
    final static int n1;
    static  {
        n1=1;
    }
}