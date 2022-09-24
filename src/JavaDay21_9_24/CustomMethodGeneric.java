package JavaDay21_9_24;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        //当调用方法时，传入参数编译器就会确定类型
        car1.fly("宝马",100);
        car1.fly(100,100.1);
        Fish<String, ArrayList> fish = new Fish<>();
    }
}
class Fish<T,R>{

    public void run(){

    }

    public<U ,M>void eat(){

    }
    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public<K> void hello(R r, K k) {
        System.out.println(r.getClass());//ArrayList
         System.out.println(k.getClass());//Float
        }
}
class Car1{
    public void run(){

    }
    public <T,R> void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}