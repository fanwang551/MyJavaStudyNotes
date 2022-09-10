package JavaDay10_9_10;

import java.util.Scanner;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom=new Stu("tom");
     //   tom.payFee(100);

        Stu zhao = new Stu("zhao");
        Stu.payFee(100);
        Stu.payFee(200);
        Stu.showFee();
        //如果我们希望不创建实例，也可以调用某个方法(即当做工具来使用)
        // 这时，把方法做成静态方法时非常合适
        System.out.println(Tools.calSum(10,20));
    }
}
class Tools{
    public static double calSum(double n1,double n2){
        return n1+n2;
    }
}
class Stu{
    private String name;
    private static double fee=0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee+=fee;
    }
    public static void showFee(){
        System.out.println("总学费"+Stu.fee);
    }
}