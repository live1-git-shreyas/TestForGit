package com.basicsofjava;

import java.util.Scanner;

public class whileEx {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("while:");
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("do while :");
        do{
            System.out.println(i);
            i--;
        }while (i>=0);

    }
}