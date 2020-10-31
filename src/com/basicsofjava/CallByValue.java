package com.basicsofjava;

public class CallByValue {

    int data =  50;
    public void change(int data){
        data = data + 100;
        System.out.println("addition = "+ data);

    }

    public static void main(String[] args) {
        CallByValue cbv = new CallByValue();
        System.out.println("Before cbv : " +cbv.data);
        cbv.change(100);
        System.out.println("After cbv :"+cbv.data);
    }

}
