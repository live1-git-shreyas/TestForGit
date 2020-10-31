package com.basicsofjava;

public class ObjectEx {


    public static void main(String[] args) {
        Object[] obj  = new Object[4];
        obj[0]="Bangalore";
        obj[1]=23;
        obj[2]=true;
        obj[3]=23.45;
        //System.out.println("String Length : " +str.length);
        for(Object s : obj){
            System.out.println(s);
        }

    }
}
