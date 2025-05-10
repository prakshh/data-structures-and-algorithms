package javaWorld.pepcoding.dsa_level_1._10_14_prime_number_upto_n;

import java.util.Scanner;

public class PrimeNumberUptoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print prime numbers upto ?");
        int n = scn.nextInt();

        for(int i = 2; i < n; i++) {
            int count = 0;
            for(int div = 2; div * div <= i; div++) {
                if(i % div == 0) {
                    count++;
                    break;
                }
            }

            if(count == 0) {
                System.out.println(i);
            }
        }
        scn.close();
    }
}
