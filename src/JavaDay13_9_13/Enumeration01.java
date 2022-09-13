package JavaDay13_9_13;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }
}

//枚举的实现
class Season{
    private String name;
    private String describe;//描述

//定义四个固定对象
public static final Season SPRING =new Season("春天","温暖");
public static final Season SUMMER =new Season("夏天","炎热");
public static final Season AUTUMN =new Season("秋天","凉爽");
public static final Season WINNER =new Season("冬天","寒冷");
    //1. 将构造器私有化,目的防止 直接 new
    // 2. 去掉 setXxx 方法, 防止属性被修改
    private Season(String name, String describe) {
        this.name = name;
        this.describe = describe;
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