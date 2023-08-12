package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //rw.name = "Amish";
        //System.out.println(rw.name);
        //'name' has private access in 'com.driver.RWOnly'
        rw.setName("Amish");
        System.out.println(rw.getName());
    }
}