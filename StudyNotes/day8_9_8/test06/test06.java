package com.company.day8_9_8.test06;

public class test06 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("wang", 20, "doctor", "男", 20000);
        Doctor doctor1 = new Doctor("wang", 21, "doctor", "男", 20000);
        System.out.println(doctor.equals(doctor1));
    }
}
