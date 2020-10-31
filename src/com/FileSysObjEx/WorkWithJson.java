package com.FileSysObjEx;

import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithJson {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(".\\Files\\MyJson.json"));
        JSONObject jobj = (JSONObject) obj;

        Object objArrray = jobj.get("Createcredentials");

        JSONArray jarrayObj = (JSONArray) objArrray;
        System.out.println(((JSONArray) objArrray).size());
        for(Object x : jarrayObj){
            JSONObject jo = (JSONObject)x;
            System.out.println(jo.get("cname"));
            System.out.println(jo.get("cpwd"));
        }
    }
}
