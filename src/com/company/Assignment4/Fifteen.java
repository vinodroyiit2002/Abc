package com.company.Assignment4;

import java.util.Scanner;

public class Fifteen {

    public static void main(String[] args) {
        int i, z;
        int sum=0;
        System.out.println("Enter how many numbers to add ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            System.out.println("Enter the number to add ");
             z = sc.nextInt();
            sum = sum + z;
        }

        System.out.print(sum);

    }
}


