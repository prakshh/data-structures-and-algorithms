package com.apnacollege;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // Make a program that takes the radius of a circle as input, calculates its area and prints it as output to the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cicle :");
        int radius = sc.nextInt();
        // double area = (22/7) * radius * radius;  // this returns 300 if radius is 10, because 22/7 returns a decimal value 3
        // double area = 3.14 * radius * radius;    // this returns 314 if radius is 10
        double area = (22 * radius * radius) / 7;   // this returns 314 if radius is 10
        System.out.println("Area of the cicle = " + area);
    }
}