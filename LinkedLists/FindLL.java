package LinkedLists;

public class FindLL {

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

    // Method to find an element
    public static void findLL(Node head, int target) {

        Node temp = head;
        int index = 0;

        while (temp != null) {

            if (temp.data == target) {
                System.out.println(target + " found at index " + index);
                return;
            }

            temp = temp.next;
            index++;
        }

        System.out.println(target + " not found in the linked list.");
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

        // Search for an element
        findLL(head, 30);
    }
}