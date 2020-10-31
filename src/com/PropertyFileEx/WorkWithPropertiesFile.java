package com.PropertyFileEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class WorkWithPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\PropertyFileEx\\Global.Properties"));

        System.out.println(prop.getProperty("BrowserType"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("TestEnvi"));

        prop.setProperty("url","www.gmail.com");
        System.out.println(prop.getProperty("url"));
    }
}
