package JavaDay23_9_27;

public class SellTicket {
    public static void main(String[] args) {
//


//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();

        SellTicket01 sellTicket01 = new SellTicket01();
       new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();

    }
}
//使用Thread方法
//线程同步
class SellTicket01 extends Thread {
    private static int ticketNum = 100;
    private boolean loop=true;

    public synchronized  void sell() {//同步方法，在同一个时刻只能有一个线程执行
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop=false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出了一张票"
                    + "剩余票数=" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();//同步方法
        }
    }

}
//实现接口的方式
class SellTicket02 extends Thread{
    private  int ticketNum=100;
    @Override
    public void run(){
        while (true){
            if(ticketNum<=0){
                System.out.println("售票结束...");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出了一张票"
                    +"剩余票数="+(--ticketNum));
        }
    }
}
