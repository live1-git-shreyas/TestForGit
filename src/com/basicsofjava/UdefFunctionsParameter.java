package com.basicsofjava;

public class UdefFunctionsParameter {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       int sum = add(a,b);
        System.out.println("Sum in main method : "+sum);
    }

    public static int add(int x, int y) {
        int sum = x + y;
        System.out.println("Sum : " + sum);
        return sum;
    }
}
