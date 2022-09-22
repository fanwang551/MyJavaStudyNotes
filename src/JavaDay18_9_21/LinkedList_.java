package JavaDay18_9_21;

import javax.xml.soap.Node;

public class LinkedList_ {
    //线程不安全
    //添加和删除效率高
    public static void main(String[] args) {
        Node1 jack = new Node1("jack");
        Node1 zhao = new Node1("zhao");
        Node1 qian = new Node1("qian");

        jack.next=zhao;
        zhao.next=qian;
        qian.pre=jack;

        Node1 first=jack;
        Node1 last=qian;

        //遍历
        while (true){
            if(first==null){
                break;
            }
            System.out.println(first);
            first=first.next;
        }
        Node1 sun = new Node1("sun");
        sun.pre=zhao;
        zhao.next=sun;
        sun.next=qian;
        qian.pre=sun;
        first=jack;
        while (true){
            if(first==null){
                break;
            }
            System.out.println(first);
            first=first.next;
        }


    }
}
class Node1{
    public Object items;
    public Node1 next;
    public Node1 pre;

    public Node1(Object items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Node{" +
                "items=" + items +
                '}';
    }

}