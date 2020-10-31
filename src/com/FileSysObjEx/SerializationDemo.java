package com.FileSysObjEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    static FileOutputStream fos;
    static ObjectOutputStream oos;

    public static void main(String[] args) throws IOException {
        try{
            fos = new FileOutputStream(".\\Files\\emp.ser");
            oos=new ObjectOutputStream(fos);
            EmployeeInfo emp = new EmployeeInfo( 12, "Sssss",1234);
            oos.writeObject(emp);


        }catch(Throwable  t){

        }finally {
            fos.close();
            oos.close();
            System.out.println("Done");
        }


    }
}
