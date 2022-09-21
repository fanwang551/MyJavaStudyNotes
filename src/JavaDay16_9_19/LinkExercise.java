package JavaDay16_9_19;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkExercise {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add(new Book1("红楼梦","曹雪芹",10));
        list.add(new Book1("水浒传","斯奈庵",20));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object book =  iterator.next();
            System.out.println(book);
        }

    }
}
