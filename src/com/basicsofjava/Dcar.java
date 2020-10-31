package com.basicsofjava;

public class Dcar {

        String model;
        int price;

        public Dcar (String model  , int price){

            this.model = model;
            this.price = price;
        }



    public static void main(String[] args) {
        Dcar car = new Dcar("BMW",20000);
        System.out.println("Model : "+car.model);
        System.out.println("Price: "+car.price);
    }




}
