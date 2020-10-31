package com.exceptionHandling;

public class CaughtExceptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        Thread.sleep(2000);
        System.out.println("A");
        Thread.sleep(2000);
        System.out.println("A");
        Thread.sleep(2000);
    }

}
