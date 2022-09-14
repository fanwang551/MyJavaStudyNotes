package JavaDay14_9_14;

public class TryCatchDetail {
    //1.如果 try 代码块有可能有多个异常
    // 2.可以使用多个 catch 分别捕获不同的异常，相应处理
    // 3.要求子类异常写在前面，父类异常写在后面
    public static void main(String[] args) {
        try {
            Person1 person = new Person1();
            person=null;
            System.out.println(person.getName());
            int n1=10;
            int n2=0;
            int res=n1/n2;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
class Person1{
    private String name="zhao";

    public Person1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}