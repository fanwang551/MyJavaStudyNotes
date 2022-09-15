package JavaDay15_9_15;

public class String01 {
    public static void main(String[] args) {
        String name="zhao";
        name="tom";
        final char[] value={'a','b','c'};
        char[] v2={'t','o','m'};
        value[0]='H';
        //value=v2; 不可修改地址
    }
}
