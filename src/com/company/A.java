package com.company;

public class A {
    public static void main(String args[]) {
        int r, c;
        for (r = 1; r <= 5; r++) {
            for (c = 1; c <= 5; c++) {
                if ((r==1)||(r==3)|| (c == 5) ||(c == 1))
                    System.out.print("*");
                else

                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}