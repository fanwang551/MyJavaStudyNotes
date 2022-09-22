package JavaDay19__22;

public class HashMap01 {
    public static void main(String[] args) {
        //创建一个数组，数组的类型时Node[],有些人将这个数组叫做table

        Node[] table=new Node[16];
        System.out.println(table);
        //创建节点
        Node zhao = new Node("zhao",null);
        table[2]=zhao;
        Node qian = new Node("qian", null);
        zhao.next=qian;
        Node sun = new Node("sun", null);
        qian.next=sun;
        Node li = new Node("li", null);
        table[3]=li;
        System.out.println(table);
    }
}
//结点，可以存储数据。可以指向下一个节点，从而形成链表

class Node{
Object item;
Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}