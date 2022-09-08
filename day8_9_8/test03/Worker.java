package com.company.day8_9_8.test03;

public class Worker extends Employee {
    public Worker(String name, double daySalary, int workDays, double grand) {
        super(name, daySalary, workDays, grand);
    }

    @Override
    public void print() {
        System.out.println("Employee{" +
                "name='" + getName() + '\'' +
                ", daySalary=" + getDaySalary() +
                ", workDays=" + getWorkDays() +
                ", grand=" + getGrand() +  ", totalSalary="
                + getGrand()*getDaySalary()*getWorkDays()+
                '}');
    }
}
