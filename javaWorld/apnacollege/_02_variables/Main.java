package javaWorld.apnacollege._02_variables;

public class Main {
    public static void main(String[] args) {
        // variables
        
        //1. Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.

        String name = "Tony Stark";
        int age = 48;
        double price = 96.96;
        int a = 25;
        int b = 10;

        b = 20;
        name = "ironman";

        System.out.println("a is : " + a + ", b is : " + b + ", age is : " + age + " and price is : " + price);          // 20
        System.out.println("name is : " + name);    // ironman

    }
}

/*
Java data types

categorized into 2 types
    - primitive and non-primitive

primitive
    - byte, short, char, boolean, int, long, float, double

non-primitive
    - String, Array, Class, Object, Interface
*/