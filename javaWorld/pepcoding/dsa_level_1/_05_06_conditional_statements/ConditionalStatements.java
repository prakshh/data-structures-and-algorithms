package javaWorld.pepcoding.dsa_level_1._05_06_conditional_statements;

public class ConditionalStatements {
    public static void main(String[] arges) {
        int n1 = 10;
        int n2 = 30;

        if(n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else if(n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else {
            System.out.println(n1 + " is smaller than " + n2);
        }
    }
}
