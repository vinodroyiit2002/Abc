package com.company.Assignment4;

public class Three {
    public static void main(String args[]) {

        System.out.println(" xxxxxxxx how to run command line");

        if (args.length == 0) System.out.println("No Values");
        else {
            for (String i : args) System.out.println(i + " ");
        }
    }
}