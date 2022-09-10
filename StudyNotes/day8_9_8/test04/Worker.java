package com.company.day8_9_8.test04;
public class Worker extends Employee04 {
    public Worker(String name, double salary, String career) {
        super(name, salary, career);
    }

    @Override
    public void printYearSalary() {
        System.out.println("Employee{" +
                "name='" + getName() + '\'' +
                ", career=" + getCareer()+
                ", salary=" + getSalary() +
                ", yearSalary=" +getSalary()+
                        '}');
    }
}
