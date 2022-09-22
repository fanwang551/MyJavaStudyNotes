package JavaDay18_9_21;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList);
        linkedList.remove();
        linkedList.remove(2);
    }
}
