package com.FileSysObjEx;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {

    int empId;
    String name;
    transient int loginPwd;

    public EmployeeInfo(int empId, String name, int loginPwd) {
        this.empId = empId;
        this.name = name;
        this.loginPwd = loginPwd;
    }

}
