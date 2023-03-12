package com.company;

public class M {

    public static void main(String args[]) {
        int i, c;
        for (i = 1; i <= 5; i++) {
            for (c = 1; c <= 5; c++) {
                if ((c == 1) || (c == 5) || (c+i == 6 & i <=3) || (i == c & c<= 3))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
