package JavaDay16_9_19;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"All"})
    public static void main(String[] args) {
         List list=new ArrayList();
         list.add("zhao");
         list.add("sun");
        list.add(1,"qian");
        System.out.println(list);
        List list1=new ArrayList();
        list1.add("li");
        list1.add("zhou");
        list.addAll(1,list1);
        System.out.println(list);
        System.out.println(list.indexOf("li"));
        list.set(0,"li");
        System.out.println(list);
        List returnlist=list.subList(0,2);
        System.out.println(returnlist);
    }
}
