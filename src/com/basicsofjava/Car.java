package com.basicsofjava;

public class Car {
    String model;
    int price;
    int wheels;

    public static void main(String[] args) {
        Car a = new Car();

        a.model = "BMW";
        a.price = 2000;
        a.wheels = 4;

        System.out.println("Car mode is : "+a.model);
        System.out.println("Car price is : " + a.price);
        System.out.println("Car wheel count is : " + a.wheels);
    }
}
