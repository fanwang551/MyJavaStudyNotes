package JavaDay10_9_10;
//单例设计模式
//1.饿汉式
//
public class SingleTon {
    public static void main(String[] args) {
        //通过方法获取对象
        GrlFriend instance=GrlFriend.getInstance();
        System.out.println(instance);
    }
}
//如何保证只能创建一个girlfriend对象
//单例模式--饿汉式 步骤
//1.将构造器私有化
//2.在类的内部直接创建
//3.提供一个公共的static方法，返回gf对象
class GrlFriend{
    private String name;
private static GrlFriend gf=new GrlFriend("wang");
    private GrlFriend(String name) {
        this.name = name;
    }
    public static GrlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GrlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}