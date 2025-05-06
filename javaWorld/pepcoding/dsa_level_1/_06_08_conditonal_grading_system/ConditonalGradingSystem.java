package javaWorld.pepcoding.dsa_level_1._06_08_conditonal_grading_system;

public class ConditonalGradingSystem {
    public static void main(String[] args) {
        int score = 91;

        if(score > 90) {
            System.out.println("Excellent");
        } else if(score > 80) {
            System.out.println("Good");
        } else if(score > 70) {
            System.out.println("Fair");
        } else if(score > 60) {
            System.out.println("Meets Expectations");
        } else {
            System.out.println("Below par");
        }

        /*if(score >= 90) {
            System.out.println("Excellent");
        } else if(score >= 80 && score < 90) {
            System.out.println("Good");
        } else if(score >= 70 && score < 80) {
            System.out.println("Fair");
        } else if(score >= 60 && score < 70) {
            System.out.println("Meets Expectations");
        } else {
            System.out.println("Below par");
        }*/
    }
}
