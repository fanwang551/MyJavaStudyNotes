package com.company.day8_9_8.test07;

public class test07 {
    public static void main(String[] args) {
       /* Teacher teacher = new Teacher("zhao","男",30,20);
        Student student = new Student("qian","女",18,"20220908");
        teacher.printInfo();
        System.out.println("-----------------");
        student.printInfo();*/
        Person[] person=new Person[4];
            Person temp=null;
        person[0]=new Teacher("zhao","男",30,20);
        person[1]=new Teacher("sun","女",32,15);
        person[2]=new Student("qian","女",18,"20220908");
        person[3]=new Student("li","男",19,"20210908");
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-1; j++) {
                if(person[i].getAge()<person[i+1].getAge()){
                    temp=person[i];
                    person[i]=person[i+1];
                    person[i+1]=temp;
                }
            }
        }
        test07 mytest07 = new test07();
        for (int i = 0; i < person.length; i++) {
            person[i].printInfo();
            System.out.println("------------------");
        }
        for (int i = 0; i < person.length; i++) {
            mytest07.call(person[i]);
        }

    }
    public void call(Person p){
        //向下转型
        if(p instanceof Student){
            ((Student) p).study();
        }
        if(p instanceof Teacher){
            ((Teacher) p).teach();
        }else{
            System.out.println("do nothing");
        }
    }
}
