package javaWorld.pepcoding.dsa_level_1._09_12_prime_number_count;

import java.util.Scanner;

public class PrimeNumberCount {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input: ");
        int numberOfInputs = scn.nextInt();

        for(int i = 0; i < numberOfInputs; i++) {
            int userInput = scn.nextInt();
            if(userInput < 2) {
                System.out.println("userInput should be greater than 1");
            } else {
                int count = 0;
                for(int div = 2; div * div <= userInput; div++) {
                    if(userInput % div == 0) {
                        count++;
                        break;
                    }
                }

                if(count == 0) {
                    System.out.println(userInput + " is prime");
                } else {
                    System.out.println(userInput + " is not prime");
                }
            }

            // scn.close();

            // A prime number is defined as a natural number greater than 1 that has exactly two distinct positive divisors: 1 and itself.

        }

        scn.close();

    }
    
}
