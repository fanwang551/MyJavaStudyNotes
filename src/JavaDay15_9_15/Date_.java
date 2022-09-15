package JavaDay15_9_15;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_ {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(609588423);
        System.out.println("date1="+date1);
        //创建SimpleDateFormat对象，可以指定相应的格式
        //格式使用的字母是规定好的不能乱写
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println("当前日期="+format);

        //可以把一个格式化的String转成对应的Date
        //把String——>Date,使用的格式需要和给定的String的格式一致
        String s="2020年09月15日 03:37:58 星期四";
        Date parse=simpleDateFormat.parse(s);
        System.out.println("parse="+simpleDateFormat.format(parse));

    }
}
