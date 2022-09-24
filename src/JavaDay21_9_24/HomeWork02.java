package JavaDay21_9_24;

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("奥迪",40000000));
        arrayList.add(new Car("宝马",30000000));
        arrayList.add(new Car("法拉利",300000000));
        System.out.println(arrayList);
        arrayList.remove("宝马");
        System.out.println(arrayList);
        arrayList.size();
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
