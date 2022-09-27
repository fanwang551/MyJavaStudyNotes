package JavaDay23_9_27;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
            if (i==5){
                Th1 th1 = new Th1();
                Thread thread = new Thread(th1);
               thread.start();
               thread.join();
            }
        }
    }
}
class Th1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello"+i);
        }
        System.out.println("子线程结束...");

    }
}