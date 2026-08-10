package Recursions;

public class NtoOne {

    // This method prints numbers from N to 1
    static void printNtoOne(int n) {

        // Base case:
        // When n becomes 0, stop the recursion
        if (n == 0) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call:
        // Call the same method with n - 1
        printNtoOne(n - 1);
    }

    public static void main(String[] args) {

        // Start recursion with 5
        printNtoOne(5);
    }
}