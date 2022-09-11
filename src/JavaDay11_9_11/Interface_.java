package JavaDay11_9_11;

public class Interface_ {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Iphone iphone = new Iphone();
        camera.start();
        camera.stop();
        iphone.start();
        iphone.stop();
    }
}
 interface UsbInterface{
    public void start();
    public void stop();
        }
class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");

    }
    public static void a(){

    }

}
class Iphone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}