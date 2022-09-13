package JavaDay13_9_13;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season01.AUTUMN);
        System.out.println(Season01.SPRING);
    }
}


enum Season01{
   // private String name;
    //private String describe;//描述
    //如果使用了 enum 来实现枚举类
    // 1. 使用关键字 enum 替代 class
    // 2. public static final Season SPRING = new Season("春天", "温暖") 直接使用.SPRING("春天", "温暖") 解读 常量名(实参列表)
    // 3. 如果有多个常量(对象)， 使用 ,号间隔即可
    // 4. 如果使用 enum 来实现枚举，要求将定义常量对象，写在前面
    // 5. 如果我们使用的是无参构造器，创建常量对象，则可以省略 ()
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热")/*, What()*/;

    //枚举的实现
    //定义四个固定对象
    //public static final Season01 SPRING =new Season01("春天","温暖");
    //public static final Season01 SUMMER =new Season01("夏天","炎热");
   // public static final Season01 AUTUMN =new Season01("秋天","凉爽");
   // public static final Season01 WINNER =new Season01("冬天","寒冷");
    //1. 将构造器私有化,目的防止 直接 new
    // 2. 去掉 setXxx 方法, 防止属性被修改
    private String name;
    private String describe;//描述
    private Season01(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    private Season01() {
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    @Override
    public String toString() {
        return "Season{" + "name='" + name + '\'' + ", desc='"
                + describe + '\'' + '}';
    }
}
