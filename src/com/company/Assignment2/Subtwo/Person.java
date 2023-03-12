package com.company.Assignment2.Subtwo;

public class Person {

        int age;

    public void setAge(int age) {
        if (age < 0) {
            System.out.println(" Cannot be negative age");

        } else {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        System.out.println(" IllegalArgumentException: when unsuitable argument passed to a method");

               Person person = new Person();
                person.setAge(-1);
            }
        }

