package JavaDay12_9_12;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m();
        System.out.println("outer的hashcode="+outer);
    }
}
class Outer{
    private int n1=100;
    public void m1(){
        System.out.println("outer m1()");
    }
    public void m(){
        //1.局部内部类是定义在外部类的局部位置,通常在方法
        //2.可以直接访问外部类的所有成员，包含私有的
        // 3.不能添加访问修饰符,但是可以使用final修饰
        //4.作用域:仅仅在定义它的方法或代码块中
       final class Inner{
           private int n1=10;
           public void f(){
              //5.局部内部类可以直接访问外部类的成员，比如下面外部类n1和m1()
              //使用外部类名.this.成员）去访问
               //6.外部类在方法中，可以创建Inner对象，然后调用方法即可
               //7.如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
               //Outer.this本质就是外部类的对象,即哪个对象调用了m,Outer.this就是哪个对象
               System.out.println("n1="+n1+"外部类的n1="+Outer.this.n1);
               System.out.println("Outer.this.hashcode="+Outer.this);
               m1();
           }
       }
        Inner inner = new Inner();
       inner.f();
    }
}