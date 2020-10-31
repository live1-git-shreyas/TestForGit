package com.exceptionHandling;

public class FinallyEx {
    public static void main(String[] args) {
        System.out.println("A");
        try{
            System.out.println("try block");
            System.out.println(8/000);
        }catch (Throwable t){
            System.out.println(t.getMessage());
            System.out.println("Catch Block");
            System.out.println(4/000);
        }
        finally {
            System.out.println("Finally Executed");
        }
    }

}
