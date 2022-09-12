package JavaDay12_9_12;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组->接口类型数组
        USB[] usb=new USB[2];
        usb[0]=new Iphone();
        usb[1]=new Camera();
        for (int i = 0; i < usb.length; i++) {
            //动态绑定机制 和运行类型绑定
            usb[i].work();
            //向下转型
            if(usb[i] instanceof Iphone){
                ((Iphone) usb[i]).call();
            }
            if(usb[i] instanceof Camera){
                ((Camera) usb[i]).TakePhoto();
            }
        }

    }
}
interface USB{
    void work();
}
class Iphone implements USB{
    @Override
    public void work() {
        System.out.println("手机工作");
    }
    public void call(){
        System.out.println("手机可以打电话");
    }
}
class Camera implements USB{
    @Override
    public void work() {
        System.out.println("相机工作");
    }
    public void TakePhoto(){
        System.out.println("相机可以照相");
    }
}