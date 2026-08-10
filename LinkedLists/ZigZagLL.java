package LinkedLists;

public class ZigZagLL {

    // MAIN
    public static void main(String[] args) {

        // Creating the linked list
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before ZigZag:");
        printLL(head);

        // ZigZag the linked list
        head = zigZagLL(head);

        System.out.println("After ZigZag:");
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


    // ZIGZAG LINKED LIST
    static Node zigZagLL(Node head) {

        // Find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Start of second half
        Node secondHead = slow.next;

        // Break the list into two halves
        slow.next = null;


        // Reverse the second half
        Node prev = null;
        Node curr = secondHead;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        // Merge both halves alternately
        Node first = head;
        Node second = prev;

        while (first != null && second != null) {

            Node firstNext = first.next;
            Node secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }

        return head;
    }
}