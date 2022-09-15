package JavaDay15_9_15;

import java.util.Locale;

public class Test03 {
    public static void main(String[] args) {
        String name="Wang yan Ping";
        printName(name);
    }
    public static void printName(String str){
        if(str==null){
            System.out.println("str 不能为空");
            return;
        }
        String[] names=str.split(" ");
        if(names.length!=3){
            System.out.println("格式不对");
            return;
        }
       String format= String.format("%s,%s.%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
