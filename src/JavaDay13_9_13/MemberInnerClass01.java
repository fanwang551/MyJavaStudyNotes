package JavaDay13_9_13;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
outer.t1();
//外部类使用成员内部类的方法
        //1，第一种方法
        outer.new Inner();//相当于把new inner()当作outer的成员
        //语法
        Outer.Inner inner=outer.new Inner();
        inner.say();
        //2.第二种方法
        //在外部类中，编写一个方法，可以返回inner对象
        Outer.Inner innerInstance=outer.getInnerInstance();
        innerInstance.say();

    }
}
class Outer{
    private int n1=10;
    public String name="张三";
    private void hi(){
        System.out.println("hi()方法");
    }
    //成员内部类定义在外部类的成员位置
    //可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    class Inner{
        private double sal=10.1;
        private int n1=22;
        public void say(){
            //可以直接访问外部类的所有成员，包含私有的
            // 如果成员内部类的成员和外部类的成员重名，会遵守就近原则.
            // 可以通过 外部类名.this.属性 来访问外部类的成员
            System.out.println("n1="+n1+"name="+name+"外部类n1="+Outer.this.n1);
            hi();
        }
    }
    public Inner getInnerInstance(){
        return new Inner();
    }
    public void t1(){
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关的方法
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.sal);
    }
}