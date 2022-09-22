package JavaDay19__22;

import java.util.HashSet;
/*在 Java8 中, 如果一条链表的元素个数到达 TREEIFY_THRESHOLD(默认是 8 )，
 并且 table 的大小 >= MIN_TREEIFY_CAPACITY(默认 64),就会进行树化(红黑树),
  否则仍然采用数组扩容机制
   */
public class HashsetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

       /*
        for (int i = 0; i < 100; i++) {
            hashSet.add(i);
        }
*/
        for (int i = 0; i <= 12; i++) {
            hashSet.add(new A(i));
        }
        System.out.println(hashSet);
    }

}
class A{
    private int n;

    public A(int n) {
        this.n = n;
    }

    //重写hashcode 使所用的hashcode相等 添加到一条链表上
    @Override
    public int hashCode() {
        return 100;
    }
}