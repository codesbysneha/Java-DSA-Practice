package LinkedLists;

public class FindLLRecursive {

    // Head of the linked list
    static Node head;

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive method to search an element
    public static void findLLRecursive(Node head, int target, int index) {

        // Base Case
        if (head == null) {
            System.out.println(target + " not found in the linked list.");
            return;
        }

        // If found
        if (head.data == target) {
            System.out.println(target + " found at index " + index);
            return;
        }

        // Recursive Call
        findLLRecursive(head.next, target, index + 1);
    }

    // Method to print the linked list
    public static void printLL(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating the linked list
        head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Linked List:");
        printLL(head);

        // Search for an element using recursion
        findLLRecursive(head, 30, 0);
    }
}