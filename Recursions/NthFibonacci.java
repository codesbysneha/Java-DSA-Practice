package Recursions;

public class NthFibonacci {

    // This method returns the nth Fibonacci number
    static int fibonacci(int n) {

        // Base case:
        // Fibonacci of 0 is 0
        // Fibonacci of 1 is 1
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive call:
        // Add the previous two Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        // Find the 6th Fibonacci number
        System.out.println(fibonacci(6));
    }
}