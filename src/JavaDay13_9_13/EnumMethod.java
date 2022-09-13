package JavaDay13_9_13;

public class EnumMethod {
    public static void main(String[] args) {
        Season01 winter=Season01.WINTER;
        Season01 spring=Season01.SPRING;
        //输出枚举对象的名字
        System.out.println(winter.name());
        //ordinal() 输出的是该枚举对象的次序/编号，从 0 开始编号
        System.out.println(winter.ordinal());
        //从反编译可以看出 values 方法，返回 Season01[]
        Season01[] values=Season01.values();
        System.out.println("==遍历取出枚举对象==");
        //增强for
        for (Season01 season:values) {
            System.out.println(season);
        }
        //valueOf：将字符串转换成枚举对象，要求字符串必须 为已有的常量名，否则报异常
        //执行流程
        // 1. 根据你输入的 "AUTUMN" 到 Season2 的枚举对象去查找
        // 2. 如果找到了，就返回，如果没有找到，就报错
        Season01 spring1=Season01.valueOf("SPRING");
        System.out.println("spring="+spring);
        System.out.println(spring1==spring);

        //compareTo：比较两个枚举常量，比较的就是编号
        //1. 就是把 Season2.AUTUMN 枚举对象的编号 和 Season2.SUMMER 枚举对象的编号比较
        /*public final int compareTo(E o) {
        return self.ordinal - other.ordinal;
         }
         Season2.AUTUMN 的编号[2] - Season2.SUMMER 的编号[3] */
        System.out.println(Season01.AUTUMN.compareTo(Season01.SUMMER));

    }
}
