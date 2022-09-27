package JavaDay23_9_27;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        Th th = new Th();
        th.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程运行"+i);
            if(i==5){
                System.out.println("让子线程先执行");
                th.join();//相当于让子线程先执行完毕
            }
        }
    }
}
class Th extends Thread {
    int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        for(int i=0;i<20;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程运行中..."+i);
        }
    }
}
