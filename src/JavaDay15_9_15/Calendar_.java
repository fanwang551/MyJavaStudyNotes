package JavaDay15_9_15;

import javax.jws.soap.SOAPBinding;
import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //1. Calendar 是一个抽象类， 并且构造器是 private
        // 2. 可以通过 getInstance() 来获取实例
        // 3. 提供大量的方法和字段提供给程序员
        //4. Calendar 没有提供对应的格式化的类，因此需要程序员自己组合来输出(灵活)
        // 5. 如果我们需要按照 24 小时进制来获取时间， Calendar.HOUR ==改成=> Calendar.HOUR_OF_DAY
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar="+calendar);
        //获取日历对象的某个字段
        System.out.println("年:"+calendar.get(Calendar.YEAR));
    }
}
