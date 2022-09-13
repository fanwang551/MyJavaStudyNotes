package JavaDay13_9_13;

public class Test03 {
    public static void main(String[] args) {
        CellIphone cellIphone = new CellIphone();
        cellIphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },1,2);
        cellIphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },1,2);

    }
}
interface Calculator{
    //具体计算放在匿名内部类
    public double work(double n1,double n2);
}
class CellIphone {
    //当调用testWork方法时，直接传入一个实现了calculator接口
    // 的匿名内部类即可，该匿名内部类可以灵活的实现接口
    public void testWork(Calculator calculator,double n1,double n2){
       double result=calculator.work( n1, n2);//动态绑定机制
        System.out.println("result="+result);
    }
}