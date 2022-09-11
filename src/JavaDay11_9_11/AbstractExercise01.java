package JavaDay11_9_11;

import javax.jws.soap.SOAPBinding;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager manager = new Manager("zhao","111",2000);
        manager.setBonus(40000);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee("qian","220",1000);
    commonEmployee.work();
    }
}
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    abstract public void work();
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理"+getName()+"正在工作");
    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"正在工作");
    }
}