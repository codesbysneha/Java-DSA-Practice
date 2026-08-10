package Recursions;

public class SortedArray {

    // This method checks whether the array is sorted
    static boolean isSorted(int[] arr, int index) {

        // Base case:
        // If we reach the last element,
        // the array is sorted
        if (index == arr.length - 1) {
            return true;
        }

        // Check if current element is greater
        // than the next element
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive call:
        // Check the next pair
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(isSorted(arr, 0));
    }
}