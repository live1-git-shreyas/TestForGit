package com.basicsofjava;

public class Ccar {
    String model;

    public static void main(String[] args) {
        Ccar a = new Ccar();
        Ccar b = new Ccar();
        Ccar c = new Ccar();

        a.model = "BMW";
        b.model = "Skoda";
        c.model = "Maruthi";

        System.out.println("A Model : "+a.model);
        System.out.println("B Model : "+b.model);
        System.out.println("C Model : "+c.model);

        a=b;
        b=c;
        c=a;

        System.out.println("A Model : "+a.model);
        System.out.println("B Model : "+b.model);
        System.out.println("C Model : "+c.model);
    }
}
