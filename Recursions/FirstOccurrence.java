package Recursions;

public class FirstOccurrence {

    // This method finds the first occurrence of key
    static int firstOccurrence(int[] arr, int index, int key) {

        // Base case:
        // If we reach the end of the array,
        // the element was not found
        if (index == arr.length) {
            return -1;
        }

        // Check if the current element is the key
        if (arr[index] == key) {
            return index;
        }

        // Recursive call:
        // Move to the next index
        return firstOccurrence(arr, index + 1, key);
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 2, 10};

        // Search for 2 starting from index 0
        System.out.println(firstOccurrence(arr, 0, 2));
    }
}