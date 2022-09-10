package com.company.day8_9_8.test03;

public class Employee {
    private String name;
    private double daySalary;
    private int workDays;
    private double grand;
    private double totalSalary;

    public Employee(String name, double daySalary, int workDays, double grand) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.grand = grand;

    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrand() {
        return grand;
    }

    public void setGrand(double grand) {
        this.grand = grand;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public void print(){
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", daySalary=" + daySalary +
                ", workDays=" + workDays +
                ", grand=" + grand +  ", totalSalary="
                + daySalary*workDays*grand+
        '}');
    }

    /*@Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", daySalary=" + daySalary +
                ", workDays=" + workDays +
                ", grand=" + grand +
                '}';
    }*/
}
