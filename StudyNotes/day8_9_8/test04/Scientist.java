package com.company.day8_9_8.test04;

public class Scientist extends Employee04{
private double bonus;

    public Scientist(String name, double salary, String career, double bonus) {
        super(name, salary, career);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printYearSalary() {
        System.out.println("Employee{" +
                "name='" + getName() +
                ", career=" + getCareer() + '\'' +
                ", salary=" + getSalary() +
                ", yearSalary=" +(getSalary()+getBonus())+
                '}');
    }
}

