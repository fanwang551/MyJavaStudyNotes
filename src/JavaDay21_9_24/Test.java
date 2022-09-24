package JavaDay21_9_24;

import java.util.HashSet;
import java.util.Objects;


/*
public class Test {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Employee p1=new Employee("a",12);
        Employee p2=new Employee("b",12);
        System.out.println( "当前p1的hashcode="+p1.hashCode());//1076367232

        hashSet.add(p1);
        hashSet.add(p2);
        p1.setName("A");
        System.out.println( "p1的hashcode="+p1.hashCode());//1076366240
        hashSet.remove(p1);//找到的是原来的P1
        System.out.println(hashSet);
        System.out.println( "p1的hashcode="+p1.hashCode());
        Employee p3=new Employee("A",12);
        //hashSet.add("p3的hashcode="+p3.hashCode());//放在为空的hashtable
       // System.out.println(p3.hashCode());
        System.out.println(hashSet);
        Employee p4=new Employee("a",12);

        hashSet.add(p4);//挂到p1后面
        System.out.println("p4的hashcode="+p4.hashCode());
        System.out.println(hashSet);
    }
}
class Employee{
    private String name;
    private double sal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.sal, sal) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal);
    }
}*/