package JavaDay16_9_19;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Book1("红楼梦","曹雪芹",20));
        col.add(new Book1("三国演义","罗贯中",30));
        Iterator iterator = col.iterator();
        System.out.println(col);
     /*   while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }*/
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
      iterator=  col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        for(Object object:col){
            System.out.println(object);
        }
    }

}
class Book1{
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}