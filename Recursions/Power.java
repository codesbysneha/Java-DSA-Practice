package Recursions;

public class Power {

    // This method calculates x raised to the power n
    static int power(int x, int n) {

        // Base case:
        // Any number raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive call:
        // x^n = x * x^(n-1)
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {

        // Calculate 2^5
        System.out.println(power(2, 5));
    }
}