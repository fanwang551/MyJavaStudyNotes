package JavaDay13_9_13;
//匿名内部类可以当作实参直接传递，简介高效
public class InnerClassExercise01 {
    public static void main(String[] args) {
        //传统传参方式
        f(new Picture());
        //匿名内部类实现
        f(new IL(){
            @Override
            public void show() {
                System.out.println("这是一幅世界名画1");
            }
        });

    }


    public static void f(IL il) {
        il.show();
    }
}
interface IL{
    public void show();
}


class Picture implements IL{
    @Override
    public void show() {
        System.out.println("这是一幅世界名画2");
    }
}