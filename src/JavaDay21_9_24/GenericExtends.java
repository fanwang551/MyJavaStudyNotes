package JavaDay21_9_24;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        //泛型没有继承性
        // ArrayList<Object> strings = new ArrayList<String>();
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<AA> list3 = new ArrayList<>();
        ArrayList<BB> list4 = new ArrayList<>();
        ArrayList<CC> list5 = new ArrayList<>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //printCollection2(list1);
       // printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);


        printCollection3(list1);
        //printCollection3(list2);
        printCollection3(list3);
       // printCollection3(list4);
       // printCollection3(list5);
    }

    //List<?>表示任意的泛型类型都可以接受
    public static void printCollection1(List<?> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
        //List < ? extends AA >表示上限，可以接受AA或者AA的子类
        public static void printCollection2(List < ? extends AA > c){
            for (Object object : c) {
                System.out.println(object);
            }

        }
        //(List < ? super AA >表示支持AA类或者AA类的父类，不限于直接父类
    //规定了泛型的下限
    public static void printCollection3(List < ? super AA > c){
        for (Object object : c) {
            System.out.println(object);
        }

    }
    }

class AA{
    }
class BB extends AA{

}
class CC extends BB{

}




