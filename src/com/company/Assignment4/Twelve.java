package com.company.Assignment4;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        System.out.println("Check if a given number is prime or not");
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num  + " is a prime number");
        } else {
            System.out.print(num  +"is not a prime number");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        } return true;
    }
}
