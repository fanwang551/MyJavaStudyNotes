package com.company.day8_9_8.test02;

public class AssociateProfessor extends Teacher{
    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {

        System.out.println("Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary()*1.2 +
                '}');
    }
}
