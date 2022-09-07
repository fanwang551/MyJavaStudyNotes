package com.company.object;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("妖怪","巡山",1000);
        System.out.println(monster.toString()+"hashcode="+monster.hashCode());
        System.out.println(monster);
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }


//重写 toString
@Override
public String toString() {
    return "Monster{" + "name='" +
            name + '\'' + ", job='" + job + '\''
            + ", sal=" + sal + '}';
}

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("fine");
    }
}
