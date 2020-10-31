package com.basicsofjava;

public class CallByReference {

    int data =  50;
    public void change(CallByReference cbr){
        cbr.data = cbr.data + 100;
        System.out.println("addition = "+ cbr.data);

    }

    public static void main(String[] args) {
        CallByReference cbr = new CallByReference();
        System.out.println("Before cbr : " +cbr.data);
        cbr.change(cbr);
        System.out.println("After cbr :"+cbr.data);
    }

}
