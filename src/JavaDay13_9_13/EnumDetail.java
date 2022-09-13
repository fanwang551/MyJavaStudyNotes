package JavaDay13_9_13;

import javax.jws.soap.SOAPBinding;

//1) 使用 enum 关键字后，就不能再继承其它类了，因为 enum 会隐式继承 Enum，而 Java 是单继承机制。
// 2) 枚举类和普通类一样，可以实现接口，如下形式。
// enum 类名 implements 接口 1，接口 2{}
public class EnumDetail {
    public static void main(String[] args) {
  Music.CLASSIC_MUSIC.playing();
    }
}
class A{

}
/*使用 enum 关键字后，就不能再继承其它类了，
因为 enum 会隐式继承 Enum，而 Java 是单继承机制
enum Season02 extends A{

}*/
interface IPlaying{
    public void playing();
}
enum Music implements IPlaying{
    CLASSIC_MUSIC;

    @Override
    public void playing() {
        System.out.println("播放古典音乐");
    }
}