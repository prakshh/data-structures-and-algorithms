package javaWorld.pepcoding.dsa_level_1._12_18_digits_count;

import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scn.nextInt();
        
        int counter = 0;
        while(userInput != 0) {
            userInput = userInput / 10;
            counter++;
        }
        
        System.out.println("Digit count = " + counter);
        scn.close();
    }
}
