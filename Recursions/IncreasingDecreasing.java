package Recursions;

public class IncreasingDecreasing {

    // This method prints numbers in decreasing
    // and then increasing order
    static void printNumbers(int n) {

        // Base case:
        // When n becomes 0, stop recursion
        if (n == 0) {
            return;
        }

        // Decreasing order
        // This runs while going DOWN into recursion
        System.out.println(n);

        // Recursive call
        // Decrease n by 1
        printNumbers(n - 1);

        // Increasing order
        // This runs while coming BACK from recursion
        System.out.println(n);
    }

    public static void main(String[] args) {

        // Start with 5
        printNumbers(5);
    }
}