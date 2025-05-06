package javaWorld.pepcoding.dsa_level_1._08_10_inputs;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        // int x = Integer.parseInt(scn.nextLine()); // This is correct, it can also be used here
        int x = scn.nextInt();  // if you want to use this, you have to include next line
        scn.nextLine();
        /*
         * if you do not write scn.nextLine(), it will prevent to correctly capture the name.
         * Because nextInt() does not consume the newline character after the number, 
         * so nextLine() reads an empty line.
         */
        System.out.println("Enter your name : ");
        String name = scn.nextLine();
        scn.close();
        System.out.println("Hello " + name + ", here is the counting : ");
        for(int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
