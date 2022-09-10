package com.company.day8_9_8.test03;

public class Test03 {
    public static void main(String[] args) {
       /* Manager manager = new Manager("zhao",300,25,1.2);
        Worker worker = new Worker("qian",280,20,1.0);
        manager.print();
        worker.print();*/
        Employee employee = new Manager("zhao", 300, 25, 1.2);
        Employee employee1 = new Worker("qian", 280, 20, 1.0);
        employee.print();
        employee1.print();
    }
}