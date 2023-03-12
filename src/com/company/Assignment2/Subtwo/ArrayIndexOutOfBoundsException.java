package com.company.Assignment2.Subtwo;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        try {
            int[] a = new int[10];
            System.out.println(a[100]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(" Main");
        }
    }
}
