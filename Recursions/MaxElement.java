package Recursions;

public class MaxElement {

    // This method finds the maximum element
    // from the given index onwards
    static int max(int[] arr, int index) {

        // Base case:
        // If we reach the last element,
        // return that element
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Find the maximum from the remaining array
        int result = max(arr, index + 1);

        // Compare current element with
        // maximum of the remaining elements
        if (arr[index] > result) {
            return arr[index];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 25, 8, 15};

        System.out.println(max(arr, 0));
    }
}