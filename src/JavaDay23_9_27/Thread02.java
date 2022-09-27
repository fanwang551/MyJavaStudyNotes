package JavaDay23_9_27;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //不能调用start
        //底层使用了设计模式 代理模式
        Thread thread = new Thread(dog);
        thread.start();
    }

        }
class Dog implements Runnable{
    int count=0;
    @Override
    public void run(){
        while(true){
            System.out.println("小狗叫"+(count++)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
if(count==10){
    break;
}
        }
    }
}