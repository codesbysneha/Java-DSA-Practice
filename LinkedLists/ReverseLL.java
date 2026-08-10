package LinkedLists;

public class ReverseLL {

    // MAIN
    public static void main(String[] args) {

        // Creating the linked list
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before reversing:");
        printLL(head);

        // Reverse the linked list
        head = reverseLL(head);

        System.out.println("After reversing:");
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


    // REVERSE LINKED LIST
    static Node reverseLL(Node head) {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        return head;
    }
}