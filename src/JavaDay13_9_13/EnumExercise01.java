package JavaDay13_9_13;

public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy=Gender.BOY;
        Gender boy1=Gender.BOY;
        //使用关键字 enum 时，会隐式继承 Enum 类, 这样我们就可以使用 Enum 类相关的方法。
        //本质就是调用Gender的父类Enum的toString
        System.out.println(boy);
        System.out.println(boy1);
        System.out.println(boy==boy1);
    }


}
enum Gender {
    BOY, GIRL;
private String name;
    public String toString() {
        return name;
    }
}
