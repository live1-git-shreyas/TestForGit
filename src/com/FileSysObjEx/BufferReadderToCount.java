package com.FileSysObjEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReadderToCount {
   static FileReader fr;
   static BufferedReader br;
   static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        fr = new FileReader(".\\Files\\file1.txt");
        br=new BufferedReader(fr);
        String data;
        while((data=br.readLine())!=null){
            String readline = data;
            st=new StringTokenizer(readline);
            while(st.hasMoreTokens()){

            }
        }

    }

}
