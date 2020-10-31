package com.collectionsAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> li = new ArrayList<>();
        li.add("B");
        li.add("C");
        li.add("H");
        li.add("P");
        li.add("B");
        li.add("C");

        int size = li.size();
        System.out.println("size = "+size);
        System.out.println("printing using for with counter");
        Iterator<String> it = li.iterator();
        for(int i =0;i<li.size();i++){
            System.out.println(li.get(i));
        }
        System.out.println("Printing using for each");
        for(String x : li){
            System.out.println(x);
        }
        System.out.println("Printin using while and iterator with hasNext");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
