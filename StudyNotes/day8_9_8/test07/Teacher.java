package com.company.day8_9_8.test07;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我上课划水");
    }

    @Override
    public String play() {
        return getName()+"is watching tv";
    }

    @Override
    public void printInfo() {
        System.out.println("老师的信息：" +'\n'+
                "姓名：" + getName() + '\n' +
                "性别：" + getSex() + '\n' +
                "年龄：" + getAge() +"工龄:"+getWork_age()+'\n' +this.play()
        );
    }
}
