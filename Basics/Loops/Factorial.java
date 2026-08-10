package Loops;

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Number to calculate factorial
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact *= i; // Multiply factorial by the current number
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
    
}
