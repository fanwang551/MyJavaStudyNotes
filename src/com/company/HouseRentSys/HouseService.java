package com.company.HouseRentSys;

import com.Utility.Utility;

public class HouseService extends House{
    private House[] houses;
    //记录当前有多少个房屋信息
    private int houseNum=1;
    private int idCounter=1;
    public HouseService(int size) {
        houses=new House[size];
        //初始化houses
        houses[0]=new House("wang","123","昆明",3000,"未出租",1);
    }

    public HouseService(String name, String tel, String address,
                        double rentFee, String state, int id) {
        super(name, tel, address, rentFee, state, id);
    }

    //新增房源，接收输入，创建house对象
    public boolean addHouse(House newHouse){
        System.out.println("============添加房屋===============");
        if(houseNum==houses.length){
            System.out.println("数组已满，不能再添加...");
            return false;
        }
        houses[houseNum]=newHouse;
        houseNum++;
        //设计id自增
        idCounter++;
        newHouse.setId(idCounter);
        return true;
    }
    //删除房屋
    public boolean del(int deId){
        System.out.println("\"============删除房屋===============\"");
        int index=-1;
        for (int i = 0; i < houseNum; i++) {
            if(deId==houses[i].getId()){
                index=i;
            }
        }
        if(index==-1){
            return false;
        }
        for (int i = index; i < houseNum-1; i++) {
            houses[i]=houses[i+1];
        }
        houses[--houseNum]=null;

        return true;
    }
    //查找房屋
    public House findById(int id){
        //System.out.println("查 找 房 屋");
        for (int i = 0; i < houseNum; i++) {
            if(id==houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    //修改房屋信息
    public void update(){
        //System.out.println("修 改 房 屋 信 息");


    }
    //房屋列表,返回的房屋信息
    public House[] listHose(){
        return houses;
    }
}
