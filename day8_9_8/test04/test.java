package com.company.day8_9_8.test04;

public class test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("zhao",6000,"teacher",10,200);
        Worker worker = new Worker("qian",5000,"worker");
        Waiter waiter = new Waiter("sun",50000,"waiter");
        Passant passant = new Passant("li",5500,"passant");
        Scientist scientist = new Scientist("zhou",7000,"scientist",50000);
        teacher.printYearSalary();
        worker.printYearSalary();
        waiter.printYearSalary();
        passant.printYearSalary();
        scientist.printYearSalary();
    }
}
