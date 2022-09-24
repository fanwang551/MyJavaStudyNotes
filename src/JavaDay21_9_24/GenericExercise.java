package JavaDay21_9_24;

import java.util.*;

@SuppressWarnings({"all"})

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 18));
        students.add(new Student("tom", 28));
        students.add(new Student("mary",19));
        for (Student student :students) {
            System.out.println(student);
        }

        HashMap<String, Student> hm= new HashMap<>();
        hm.put("jack",new Student("jac",19));
        hm.put("tom",new Student("to",28));

        Set<Map.Entry<String,Student>> entries = hm.entrySet();
        for (Map.Entry<String,Student> o :entries) {
            System.out.println(o);
        }

        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey()+"_"+next.getValue());
        }

    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}