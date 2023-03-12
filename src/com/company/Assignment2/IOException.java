package com.company.Assignment2;
import java.io.*;
public class IOException {

    public static void main(String[] args) {
        System.out.println("when you try to read a file that does not exist, it will throw an IOException");

        try {
            FileInputStream GFG  = new FileInputStream("/Desktop/GFG.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
