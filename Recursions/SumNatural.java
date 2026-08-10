package Recursions;

public class SumNatural {

    // This method returns the sum of numbers from 1 to n
    static int sum(int n) {

        // Base case:
        // When n becomes 0, stop the recursion
        if (n == 0) {
            return 0;
        }

        // Add n to the sum of numbers before it
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        // Find the sum of first 5 natural numbers
        System.out.println(sum(5));
    }
}