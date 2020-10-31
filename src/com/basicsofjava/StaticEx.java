package com.basicsofjava;

public class StaticEx {
    String model;
    int p;
    static int wheels = 4;

    public void testForStatic(){
        System.out.println("Test for static");
    }

    public static void main(String[] args) {
        System.out.println("Wheels : "+wheels);
        StaticEx ex = new StaticEx();
        ex.testForStatic();
        System.out.println(ex.model);
    }
}
