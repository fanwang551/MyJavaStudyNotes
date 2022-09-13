package JavaDay13_9_13;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test01 {
    public static void main(String[] args) {

    }
}
class Frock{
    //静态啊属性所有类共享
    private static int currentNum=100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }

}
class TestFrock{
    public static void main(String[] args) {
        //类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问。
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        //currentNum是每次递增的，即静态啊属性所有类共享
        System.out.println(frock.getSerialNumber());//100300
        System.out.println(frock1.getSerialNumber());//100400
        System.out.println(frock2.getSerialNumber());//100500
    }
}