package javaWorld.pepcoding.dsa_level_1._11_16_fibonacci;

import java.util.Scanner;

public class FibonacciNumbersUptoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number upto which you want see the Fibonacci numbers: ");
        int userInput = scn.nextInt();
        
        int firstNumber = 0;
        int secondNumber = 1;
        // int thirdNumber = firstNumber + secondNumber;

        for(int i = 0; i < userInput; i++) {
            System.out.println(firstNumber);
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        scn.close();
    }
}
