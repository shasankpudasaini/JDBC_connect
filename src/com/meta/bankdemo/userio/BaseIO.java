package com.meta.bankdemo.userio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaseIO {

    BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

    public void display(String message) {
        System.out.println("----------------");
        System.out.println(message);
    }

    public String read(String fieldName){
       try{
        display("Enter customer's " + fieldName);
        return bufferedReader.readLine(); }
       catch (Exception ex) {
           ex.printStackTrace();
           return null;
       }
    }
    public String readChoice(String message){
        try{
            display(message);
            return bufferedReader.readLine(); }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
