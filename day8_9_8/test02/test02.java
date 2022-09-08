package com.company.day8_9_8.test02;

public class test02 {
    public static void main(String[] args) {

      Professor professor=new Professor("zhao",55,"professor",10000);
      professor.introduce();
      AssociateProfessor associateProfessor = new AssociateProfessor("qian",50,"AssociateProfessor",8000);
        // Teacher teacher=new AssociateProfessor();
        Lecturer lecturer = new Lecturer("sun",45, "Lecturer",7000);
        lecturer.introduce();
        associateProfessor.introduce();
    }
}
