package com.company.day8_9_8.test04;

public class Teacher extends Employee04 {
    private int classDay;
    private double classSal;

    public Teacher(String name, double salary, String career, int classDay, double classSal) {
        super(name, salary, career);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printYearSalary() {
        System.out.println("Employee{" +
                "name='" + getName() +
                ", career=" + getCareer() + '\'' +
                ", salary=" + getSalary() +
                ", yearSalary=" +getSalary()+getClassSal()*getSalary()+
                '}');
    }
}
