package JavaDay11_9_11;
//抽象类的最佳实践--模板设计模式
//抽象类作为多个子类的通用模板，子类在抽象类的基础进行扩展，改造，但子类总会保留抽象类的行为方式


//实践：有多个类完成不同的job，要求统计得到完成各自任务的时间
public class AbstractExercise02 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();
        BB bb = new BB();
        bb.calculateTime();
    }
}
abstract  class Template{
    public abstract void job();
    public void calculateTime(){
        long start=System.currentTimeMillis();
        job();//动态绑定机制
        long end=System.currentTimeMillis();
        System.out.println("任务执行时间："+(end-start));
    }
}
 class AA extends Template{
    @Override
    public void job() {
        long num=0;
        //long start=System.currentTimeMillis();
        for ( long i = 0;  i<=50000000 ; i++) {
            num+=1;
        }
       // long end=System.currentTimeMillis();
        //System.out.println("任务执行时间："+(end-start));
    }
}
class BB extends Template{
    @Override
    public void job() {
        long num=0;
        for ( long i = 0;  i<=80000000 ; i++) {
            num*=1;
        }
    }
}