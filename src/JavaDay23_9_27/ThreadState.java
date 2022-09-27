package JavaDay23_9_27;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Th2 th2 = new Th2();
        Thread thread = new Thread(th2);
        System.out.println(thread.getName()+"状态"+thread.getState());
        thread.start();

        while(Thread.State.TERMINATED!=thread.getState()){
            System.out.println(thread.getName()+"状态"+thread.getState());
            Thread.sleep(500);
        }
    }
}
class Th2 implements Runnable {
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
    }
}