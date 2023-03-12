package com.company.Assignment4;

import java.util.Scanner;

public class Four {

       public static void main(String[ ]args)
        {

            System.out.println("enter alphabets");
            Scanner sc=new Scanner(System.in);
            char ch1=sc.next().charAt(0);
            char ch2=sc.next().charAt(0);
            if(ch1>ch2)
            {
                System.out.println(ch2+","+ch1);
            }
            else
            {
                System.out.println(ch1+","+ch2);
            }
        }
    }

