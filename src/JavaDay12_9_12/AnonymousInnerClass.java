package JavaDay12_9_12;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.method();
    }
}
class Outer01 {
    private int n1 = 1;//属性

    public void method() {
        //tiger的编译类型：IA
        //tiger的运行类型：就是匿名内部类 Outer01_
        //基于接口
        class Outer01_ implements IA {
            @Override
            public void cry() {
                System.out.println("老虎叫唤。。。");
            }
        }
        //jdk底层在创建匿名内部类Outer01-,立即马上就创建了Outer01-实例，并且把地址返回给tiger
        //匿名内部类使用一次，就不能再使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        //tiger的运行类型：就是匿名内部类 Outer01_
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();
        // IA tiger=new Tiger();

        //1.father编译类型Father
        //2.father运行类型Outer04$2
        // 3.底层会创建匿名内部类
        class Outer01__ extends Father{
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        }
        //基于类
        ///4.同时也直接返回了匿名内部类Outer01$2的对象
        Father father = new Father("wang"){
            @Override
            public void test() {
                System.out.println("匿名内部类1重写了test方法");
            }
        };
        System.out.println("father对象的运行类型="+father.getClass());//Outer01$1
         father.test();

         //基于抽象类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗啃骨头");
            }
        };
        System.out.println("animal的运行类型="+animal.getClass());
        animal.eat();
    }
}
    interface IA {
        public void cry();
    }

class Father{
    private String name;

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name="+name);
    }
    public void test(){

    }
}
abstract class Animal{
    abstract void eat();
}