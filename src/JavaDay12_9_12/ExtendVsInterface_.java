package JavaDay12_9_12;
//继承 //小结: 当子类继承了父类，就自动的拥有父类的功能
// 如果子类需要扩展功能，可以通过实现接口的方式扩展.
// 可以理解 实现接口 是 对 java 单继承机制的一种补充
public class ExtendVsInterface_ {
    public static void main(String[] args) {
        LittleMoney littleMoney = new LittleMoney("zhao");
        littleMoney.flying();
        littleMoney.swimming();
        littleMoney.climbing();
    }
}
class Money{
    private String name;

    public Money(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println(name+"猴子会爬树");
    }
}
interface Fish{
    void swimming();
}
interface Bird{
    void flying();
}
class LittleMoney extends Money implements Fish,Bird{
    public LittleMoney(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习，可以像鱼儿一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName()+"通过学习，可以像鸟儿一样飞翔");
    }
}