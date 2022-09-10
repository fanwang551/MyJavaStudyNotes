package com.company.HouseRentSys;

public class House {
    private String name;
    private String Tel;
    private String address;
    private double rentFee;
    private String state;
    private int id;

    public House(String name, String tel, String address,
                 double rentFee, String state, int id) {
        this.name = name;
        Tel = tel;
        this.address = address;
        this.rentFee = rentFee;
        this.state = state;
        this.id = id;
    }

    public House() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRentFee() {
        return rentFee;
    }

    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t" + Tel +
                "\t\t"+ address +
                "\t\t" + rentFee +
                "\t\t" + state +
                "\t\t" ;
    }
}
