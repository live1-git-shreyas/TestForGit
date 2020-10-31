package com.basicsofjava;

public class ForEachEx {


    public static void main(String[] args) {
        String[] str  = {"B","C","H","P"};
        System.out.println("String Length : " +str.length);
        for(String s : str){
            System.out.println(s);
        }

        int[] ind = {1,3,5,7,9,11};
        System.out.println("Integer Length : " +ind.length);
        for(int s : ind){
            System.out.println(s);
        }
    }
}
