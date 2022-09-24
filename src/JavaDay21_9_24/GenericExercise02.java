package JavaDay21_9_24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {

        ArrayList<Employee1>  employee1s = new ArrayList<>();
        employee1s.add(new Employee1("zhao",3000,new myDate(2002,2,3)));
        employee1s.add(new Employee1("sun",5000,new myDate(2001,2,3)));
        employee1s.add(new Employee1("li",1000,new myDate(2000,2,3)));
        Iterator<Employee1> iterator = employee1s.iterator();
        while (iterator.hasNext()) {
            Employee1 next = iterator.next();
            System.out.println(next);
        }
        employee1s.sort(new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 o1, Employee1 o2) {
                if (!(o1 instanceof Employee1 && o2 instanceof Employee1)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int nameLength = o1.getName().compareTo(o2.getName());
                if (nameLength != 0) {
                    return nameLength;
                }
               return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(employee1s);
    }
}
class Employee1{
    private String name;
    private double sal;
    private myDate birthday;

    public Employee1(String name, double sal, myDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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

    public myDate getBirthday() {
        return birthday;
    }

    public void setBirthday(myDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Double.compare(employee1.sal, sal) == 0 && Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class myDate implements Comparable<myDate>{
    private int year;
    private int month;
    private int day;

    public myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myDate myDate = (myDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "myDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(myDate o) {
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        int monthMinus = month- o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }

        return day-o.getDay();
    }
}