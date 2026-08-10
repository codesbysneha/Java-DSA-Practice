package LinkedLists;

public class LinkedListBasic {

    // MAIN
    public static void main(String[] args) {

        // Creating the linked list
        Node head = new Node(10);

        Node second = new Node(20);
        head.next = second;

        Node third = new Node(30);
        second.next = third;

        Node fourth = new Node(40);
        third.next = fourth;

        // Print linked list
        System.out.println("Linked List:");
        printLL(head);
    }


    // NODE CLASS
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // PRINT LINKED LIST
    static void printLL(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }
}