package JavaDay23_9_27;
@SuppressWarnings({"all"})
public class ThreadExit01 {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        //如果希望main线程去控制t的终止
        //通知方式
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setLoop(false);
    }
}
class T extends Thread{
    int count=0;
    //设置一个控制变量
    private boolean loop=true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("运行中...");
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
