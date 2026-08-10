package LinkedLists;

public class RemoveLastLL {

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

    // Remove last node
    public static void removeLast() {

        // If list is empty
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Move to the second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;
    }

    // Print Linked List
    public static void printLL(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before Removing Last:");
        printLL(head);

        removeLast();

        System.out.println("After Removing Last:");
        printLL(head);
    }
}