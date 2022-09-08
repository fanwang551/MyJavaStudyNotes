package com.company.day8_9_8.test04;

public class Employee04 {
    private String name;
    private double salary;
    private String career;

    public Employee04(String name, double salary, String career) {
        this.name = name;
        this.salary = salary;
        this.career = career;
    }

    public Employee04() {
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   /* @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }*/
    public void printYearSalary(){
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", career=" + career +
                ", salary=" + salary +
                '}');
    }
}
