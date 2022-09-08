package com.company.day8_9_8;

public class Test01 {
    public static void main(String[] args) {

        Person[] person = new Person[3];
       person[0] = new Person("zhao", "打螺丝", 20);
        person[1] = new Person("qian", "搬砖", 18);
        person[2] = new Person("sun", "java工程师", 23);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        Person tem=null;
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length - 1; j++) {
                if(person[i].getAge()>person[i+1].getAge()){
                    tem=person[i];
                    person[i]=person[i+1];
                    person[i+1]=tem;
                }
            }
        }
        System.out.println("排序后：");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}