package JavaDay15_9_15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);
        //使用DateTimeFormatter 对象进行格式化
        DateTimeFormatter dateTimeFormatter=
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format=dateTimeFormatter.format(now);
        System.out.println("格式化的日期："+format);

        //提供 plus 和 minus 方法可以对当前时间进行加或者减
        // 看看 890 天后，是什么时候 把 年月日-时分秒
        LocalDateTime localDateTime=now.plusDays(890);
        System.out.println("890天后="+dateTimeFormatter.format(localDateTime));

        LocalDateTime localDateTime1=now.minusMinutes(3466);
        System.out.println("3466分钟前"+dateTimeFormatter.format(localDateTime1));

    }
}

