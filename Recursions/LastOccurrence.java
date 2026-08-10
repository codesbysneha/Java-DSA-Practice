package Recursions;

public class LastOccurrence {

    // This method finds the last occurrence of key
    static int lastOccurrence(int[] arr, int index, int key) {

        // Base case:
        // If we reach the end of the array,
        // return -1
        if (index == arr.length) {
            return -1;
        }

        // First search in the remaining array
        int result = lastOccurrence(arr, index + 1, key);

        // If the element was found later,
        // return that index
        if (result != -1) {
            return result;
        }

        // If it was not found later,
        // check the current index
        if (arr[index] == key) {
            return index;
        }

        // Element was not found
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 2, 10};

        // Search for the last occurrence of 2
        System.out.println(lastOccurrence(arr, 0, 2));
    }
}