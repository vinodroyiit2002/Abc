package com.company;

public class Name {

    public static void main(String args[]) {
        int r, z, g, c;
        int k = 1;
        for (r = 1; r <= 6; r++) {
            for (z = 1; z <= 25; z++)
                System.out.print(" ");
            for (c = 1; c <= 5; c++) {
                if ((c == 1) || (r == 1) || (r == 3) || ((c == 5) & (r <= 2)) || ((r + c) == k)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            k = k + 2;
            System.out.println();


        }
    }
}


