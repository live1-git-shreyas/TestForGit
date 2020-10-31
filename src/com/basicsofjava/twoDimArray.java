package com.basicsofjava;

public class twoDimArray {


    public static void main(String[] args) {
        Object[] []obj  = new Object[3][2];
        obj[0][0]="name1";
        obj[0][1]="pwd1";
        obj[1][0]="name2";
        obj[1][1]="pwd2";
        obj[2][0]="name3";
        obj[2][1]="pwd3";
        //System.out.println("String Length : " +str.length);
        for(int i=0;i<obj.length;i++){
            for(int j=0;j<obj[0].length;j++)
            {
                System.out.println(obj[i][j]);
            }
        }


    }
}
