package JavaDay13_9_13;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
    }
}

//1. @Deprecated 修饰某个元素, 表示该元素已经过时
// 2. 即不在推荐使用，但是仍然可以使用
    //3.可以做过渡使用
@Deprecated
class AA{
    public int n1=10;
    public void hi(){}

}