package com.company.PolyParameter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PolyParameterTest {
    public static void main(String[] args) {
        Worker zhao=new Worker("zhao",2000);
        Manager qian=new Manager("qian",10000,20000);
        PolyParameterTest polyParameterTest = new PolyParameterTest();

        polyParameterTest.showEmployAnnual(zhao);
        polyParameterTest.showEmployAnnual(qian);
        polyParameterTest.testWorker(zhao);
        polyParameterTest.testWorker(qian);




    }
    //方法定义的形参；类型为父类类型，实参leixing允许为子类类型
    public void showEmployAnnual(Employee e){
        //动态绑定机制
        System.out.println(e.getAnnual());
    }
    public void testWorker(Employee e){
        if(e instanceof Worker){
            //向下转型
            ((Worker) e).work();
        }else if(e instanceof Manager){
            //向下转型
            ((Manager) e).manage();
        }else{
            System.out.println("不做处理");
        }
    }

    public PolyParameterTest() {
        //"hello".equals("qwe");
    }



}
