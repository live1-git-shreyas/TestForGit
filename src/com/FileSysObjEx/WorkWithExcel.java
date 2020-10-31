package com.FileSysObjEx;

import xls.ShineXlsReader;

public class WorkWithExcel {
    public static void main(String[] args) {
        ShineXlsReader xls = new ShineXlsReader(".\\Files\\TestData.xlsx");
        int rowCount = xls.getRowCount("Sheet1");
        int colCount = xls.getColumnCount("Sheet1");
        System.out.println("Row Count = " +rowCount);
        System.out.println("Col Count = "+colCount);

        if(!xls.isSheetExist("Sheet4")){
            xls.addSheet("Sheet4");
        }
        xls.addColumn("Sheet4","Employee Name");
        xls.setCellData("Sheet4","Employee Name",2,"Shreyas");
        System.out.println("Done");
        /*for(int i=2;i<=rowCount;i++){
            for(int j = 0;j<colCount;j++){
                String cellData = xls.getCellData("Sheet1",j,i);
                System.out.println(cellData);
            }
        }*/
    }
}
