package JavaDay14_9_14;

public class Test04 {
    public static void main(String[] args) {
        A a = new A();
        a.m();
        System.out.println("A hashcode="+a);
    }
}
class A{
    private int n1=100;
    public void m(){
        class B{
           private final String name="zhao";
           public void show(){
               System.out.println(name);
               System.out.println("n1="+A.this.n1);
               System.out.println("A.this.hashcode"+A.this);
           }

        }
        B b = new B();
        b.show();
    }
}
