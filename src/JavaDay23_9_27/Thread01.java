package JavaDay23_9_27;
//当一个类继承了Thread类，该类就可以当做线程使用
//run Thread 类实现了Runnable接口的run方法
public class Thread01 {
    public static void main(String[] args) {
        //创建cat对象可以当线程使用
        Cat cat = new Cat();
        cat.start();//启动线程  最终会执行cat的run方法 实际为start0方法
        System.out.println("主程序执行"+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Cat extends Thread{
    int times=0;
    @Override
    public void run() {

        //线程休息
        while (true) {
            System.out.println("我是猫"+times++);
            try {
                //线程休息1s
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times==800){
                break;
            }
        }
    }
}
