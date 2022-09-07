package com.company.Poly;

public class Poly_Test {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下：要求创建 1 个 Person 对象、
        // 2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组中，并调用每个对象 say 方法
         Person[] person=new Person[5];
         person[0]=new Person("zhao",20);
         person[1]=new Student("qian",19,100);
         person[2]=new Student("sun",18,60);
         person[3]=new Teacher("wang",25,100000);
         person[4]=new Teacher("li",24,1000);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());
            if(person[i] instanceof Student){
                Student student=(Student) person[i];
                student.study();
            }else if(person[i] instanceof Teacher){
                Teacher teacher=(Teacher) person[i];
                teacher.teach();
            }else if(person[i] instanceof Person){
               // System.out.println("类型有误");
            }else {
                System.out.println("类型有误");
            }
        }
    }
}
