package javaWorld.pepcoding.dsa_level_1._04_variables;

public class Variables {
    public static void main(String[] args) {
        int x = 25;
        int y = 75;
        int sum = x + y;
        System.out.println("Sum of " + x + " and " + y + " is : " + sum);
        // Sum of 25 and 75 is : 100

        int prod = x * y;
        System.out.println("Prod of " + x + " and " + y + " is : " + prod);
        // Prod of 25 and 75 is : 1875

        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println("v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
        // v1 = 0, v2 = 3, v3 = 25

        int exp = (x * y) / (y / x);
        System.out.println("exp is : " + exp); 
        // exp is : 625
    }
    
}
