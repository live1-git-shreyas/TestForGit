package com.FileSysObjEx;

import com.opencsv.CSVReader;
import xls.ShineXlsReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class WorkWithCSV {
    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(".\\Files\\TestDataForCSV.csv"));
        List<String[]> li=reader.readAll();
        System.out.println("Row count = "+li.size());
        String[] str = li.get(0);
        System.out.println("Col Length ="+str.length);
        for(String[] x: li){
            for(int i=0;i<x.length;i++){
                System.out.println(x[i]);
            }
        }




    }
}
