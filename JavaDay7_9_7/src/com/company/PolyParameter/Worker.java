package com.company.PolyParameter;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
    public void work(){
        System.out.println("普通员工"+getName()+"is working");
    }


}
