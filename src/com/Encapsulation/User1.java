package com.Encapsulation;

public class User1 {
    public static void main(String[] args) {
        MyAccount ma = new MyAccount();
        ma.setfName("TestFName");
        ma.setlName("TestLName");
        ma.setAccctNumber(123456789);

        System.out.println(ma.getfName());
        System.out.println(ma.getlName());
        System.out.println(ma.getAccctNumber());
    }
}
