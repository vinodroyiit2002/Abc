package com.company.Assignment2;
import java.io.*;
public class ClassNotFoundException {
    public static void main(String[] args) {
System.out.println(" Calling the class gfg which is not present in the current class temp instance of calling class");
        try {
            Class temp = Class.forName("gfg");
        } catch (java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
