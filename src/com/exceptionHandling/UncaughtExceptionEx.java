package com.exceptionHandling;

public class UncaughtExceptionEx {
    public static void main(String[] args) {
        System.out.println("A");
        try{
            System.out.println(8/000);
            System.out.println("try block");
        }catch (Throwable t){
            System.out.println(t.getMessage());
            System.out.println("Catch Block");
        }
    }

}
