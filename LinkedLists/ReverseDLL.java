package LinkedLists;

public class ReverseDLL {

    // MAIN
    public static void main(String[] args) {

        // Creating the doubly linked list
        Node head = new Node(10);

        Node second = new Node(20);
        head.next = second;
        second.prev = head;

        Node third = new Node(30);
        second.next = third;
        third.prev = second;

        Node fourth = new Node(40);
        third.next = fourth;
        fourth.prev = third;

        System.out.println("Before reversing:");
        printLL(head);

        // Reverse the doubly linked list
        head = reverseLL(head);

        System.out.println("After reversing:");
        printLL(head);
    }


    // NODE CLASS
    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    // PRINT LINKED LIST
    static void printLL(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " <-> ");

            temp = temp.next;
        }

        System.out.println("null");
    }


    // REVERSE DOUBLY LINKED LIST
    static Node reverseLL(Node head) {

        Node curr = head;
        Node temp = null;

        while (curr != null) {

            // Swap next and prev
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // Move curr to the next node
            curr = curr.prev;
        }

        // Update head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}