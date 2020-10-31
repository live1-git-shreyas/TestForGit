package com.basicsofjava;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        System.out.println("Enter the marks : ");
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();

        if (marks < 35) {
            System.out.println("Fail");
        } else if (marks <= 50) {
            System.out.println("PASS");
        } else if (marks <= 60) {
            System.out.println("Second");
        } else if (marks <= 70) {
            System.out.println("First");
        } else {
            System.out.println("Distinction");
        }
    }
}