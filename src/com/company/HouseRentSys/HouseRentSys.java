package com.company.HouseRentSys;

import com.Utility.Utility;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class HouseRentSys {
    boolean loop =true;
    private HouseService houseService=new HouseService(10);

    //修改房屋信息
    public void updateHouse(){
        //System.out.println("============修改房屋===============");
        //System.out.println("============请输入要查找的Id===============");
        /*Scanner scanner = new Scanner(System.in);
        int id=scanner.nextInt();*/
       // int id=Utility.readInt();
        System.out.println("============修改房屋===============");
        System.out.println("============请输入要查找的Id===============");
        /*Scanner scanner = new Scanner(System.in);
        int id=scanner.nextInt();*/
        int updateId=Utility.readInt();
        if(updateId==-1){
            System.out.println("============放弃修改信息============");
            return;
        }
        //house是引用类型，就是数组的元素
        //后面修改的是houseService中的元素
        House house = houseService.findById(updateId);
        if(house==null){
            System.out.println("============修改房屋信息编号不存在============");
            return;
        }
        System.out.println("姓名：("+house.getName()+"):");
        String name=Utility.readString(8,"");//用户直接回车，表示不修改信息 默认”“
        if(!"".equals(name)){
            house.setName(name);
        }
        System.out.println("Tel：("+house.getTel()+"):");
        String Tel=Utility.readString(8,"");//用户直接回车，表示不修改信息 默认”“
        if(!"".equals(Tel)){
            house.setTel(Tel);
        }
        System.out.println("地址：("+house.getAddress()+"):");
        String address=Utility.readString(18,"");//用户直接回车，表示不修改信息 默认”“
        if(!"".equals(address)){
            house.setAddress(address);
        }
        System.out.println("月租：("+house.getRentFee()+"):");
        double rentFee=Utility.readInt(8);//用户直接回车，表示不修改信息 默认”“
        if(!"".equals(rentFee)){
            house.setRentFee(rentFee);
        }
        System.out.println("id：("+house.getRentFee()+"):");
        int id=Utility.readInt(8);//用户直接回车，表示不修改信息 默认”“
        if(!"".equals(id)){
            house.setId(id);
        }
        System.out.println("地址：("+house.getAddress()+"):");
        String state=Utility.readString(3,"");//用户直接回车，表示不修改信息 默认”“
        if(!"".equals(state)){
            house.setAddress(state);
        }
        System.out.println("============修改房屋休息成功===============");
    }

    //查找功能（Id)
    public void findHouse(){
        System.out.println("============查找房屋===============");
        System.out.println("============请输入要查找的Id===============");
        /*Scanner scanner = new Scanner(System.in);
        int id=scanner.nextInt();*/
        int id=Utility.readInt();
       House house= houseService.findById(id);
        if(house!=null){
            System.out.println(house);
        }else{
            System.out.println("============未查找到相关信息===============");
        }

    }


    //完成退出确认
    public void exit(){
        char c= Utility.readConfirmSelection();
        if(c=='y') {
            loop = false;
        }
        System.out.println("============退出系统成功===============");
    }
    //
    public void delHouse(){
        System.out.println("============删除房屋===============");
        System.out.println("请输入待删除的房屋编号（-1退出");
        int deId=Utility.readInt();
        if(deId==-1){
            System.out.println("=========放弃删除房屋信息=========");
            return;
        }
        System.out.println("请确认是否删除（y/n),小心选择");
        char choice1=Utility.readConfirmSelection();
        if(choice1=='Y'){
            if(houseService.del(deId)){
                System.out.println("============删除房屋成功===============");
            }
        }else{
            System.out.println("============删除房屋失败===============");
        }

    }
    //
    public void addHouse(){
        System.out.println("============添加房屋===============");
        System.out.println("姓名");
        String name= Utility.readString(8);
        System.out.println("电话：");
        String Tel=Utility.readString(11);
        System.out.println("地址：");
        String address=Utility.readString(16);
        System.out.println("月租：");
        int rentFee=Utility.readInt();
        System.out.println("状态：");
        String state=Utility.readString(3);
        //创建一个House对象，Id是系统分配
        House newHouse = new House(name, Tel, address, rentFee, state, 0);
if(houseService.addHouse(newHouse)){
    System.out.println("========添加房屋成功=========");
}else {
    System.out.println("========添加房屋失败=========");
}
    }
    //listHouses 返回所有的房屋信息
    public void listHouses(){
        System.out.println("\n================房屋列表===============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t状态（已出租/未出租）");
        House[] houses= houseService.listHose();
        for (int i = 0; i < houses.length; i++) {//数组长度
            if(houses[i]==null){
                break;
            }else
            System.out.println(houses[i]);
        }
        System.out.println("\n================房屋列表显示完毕=============");

    }
    Scanner scanner=new Scanner(System.in);
    public void Menu(){
    do{
        System.out.println("\n================房屋出租系统===============");
        System.out.println("\t\t\t1 新 增 房 源");
        System.out.println("\t\t\t2 查 找 房 屋");
        System.out.println("\t\t\t3 删 除 房 屋");
        System.out.println("\t\t\t4 修 改 房 屋 信 息");
        System.out.println("\t\t\t5 房 屋 列 表");
        System.out.println("\t\t\t6  退     出");

        System.out.print("请选择(1-6): ");
       String choice = scanner.next();
       switch (choice){
           case"1":
               addHouse();
               break;
           case"2":
            findHouse();
               break;
           case"3":
              delHouse();
               break;
           case"4":
               updateHouse();
               break;
           case"5":
               listHouses();

               break;
           case"6":

               exit();
               break;
       }
    }while(loop);
}
}
