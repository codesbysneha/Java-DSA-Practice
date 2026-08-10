package LinkedLists;

public class RemoveFirstLL {

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

    // Remove first node
    public static void removeFirst() {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        head = head.next;
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

        System.out.println("Before Removing First:");
        printLL(head);

        removeFirst();

        System.out.println("After Removing First:");
        printLL(head);
    }
}