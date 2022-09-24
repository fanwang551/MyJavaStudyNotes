package JavaDay21_9_24;

import org.junit.jupiter.api.Test;

public class Junit_ {
    public static void main(String[] args) {
        new Junit_().m1();
    }

    @Test
    public void m1(){
        System.out.println("m1被调用");
    }
    public void m2(){
        System.out.println("m2被调用");
    }
}
