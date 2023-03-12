package com.company.Assignment2;

import java.io.FileInputStream;

public class FileNotFoundException {
    public static void main(String[] args) {
       System.out.print("If the given file is not found in the directory (classpath) as mentioned");

        try {
            FileInputStream fe = new FileInputStream("/Desktop/Java/new.txt");
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    }
