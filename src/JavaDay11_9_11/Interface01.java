package JavaDay11_9_11;

public class Interface01 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
       // IB.n1=20;
    }
}
//一个类可以实现多个接口
interface IB{
    int n1=10;
    void hi();
}
interface IC{
    void say();
}
class I implements IB,IC{
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
    //
    interface  ID extends IB,IC{

    }
}
