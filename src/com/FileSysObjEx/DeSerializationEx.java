package com.FileSysObjEx;

import java.io.*;

public class DeSerializationEx {
    static FileInputStream fis;
    static ObjectInputStream ois;

    public static void main(String[] args) throws IOException {
        try {
            fis = new FileInputStream(".\\Files\\emp.ser");
            ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            EmployeeInfo emp = (EmployeeInfo) o;
            System.out.println("Emp Id = " + emp.empId);
            System.out.println("Emp Name = " + emp.name);
            System.out.println("Emp Pwd = " + emp.loginPwd);

        } catch (Throwable t) {

        } finally {
            fis.close();
            ois.close();
            System.out.println("Done");
        }

    }
}
