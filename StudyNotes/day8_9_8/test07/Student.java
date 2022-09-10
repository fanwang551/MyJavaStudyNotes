package com.company.day8_9_8.test07;

public class Student extends Person {
    private String stu_id;
    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我上课也划水");
    }

    @Override
    public String play() {
        return getName()+"is playing football";
    }

    @Override
    public void printInfo() {
        System.out.println("老师的信息：" +'\n'+
                "姓名：" + getName() + '\n' +
                "性别：" + getSex() + '\n' +
                "年龄：" + getAge() +"学号"+getStu_id()+'\n' +this.play()
                );
    }
}
