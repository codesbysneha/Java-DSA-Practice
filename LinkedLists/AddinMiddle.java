package LinkedLists;

public class AddinMiddle {

    // Head of the linked list
    static Node head;

    // Blueprint of a node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to find the middle index
    public static int midnum() {

        Node temp = head;
        int count = 0;

        // Count the total number of nodes
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count / 2;
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

        Node second = new Node(20);
        head.next = second;

        Node third = new Node(30);
        second.next = third;

        Node fourth = new Node(40);
        third.next = fourth;

        // Print the linked list before insertion
        System.out.println("Before inserting:");
        printLL(head);

        // Find the middle position
        int half = midnum();

        Node temp = head;
        int c = 0;

        // Traverse to the node before the middle
        while (temp != null) {

            if (c + 1 == half) {

                // Create the new node
                Node newNode = new Node(25);

                // Link the new node to the remaining list
                newNode.next = temp.next;

                // Link the previous node to the new node
                temp.next = newNode;

                break;
            }

            temp = temp.next;
            c++;
        }

        // Print the linked list after insertion
        System.out.println("\nAfter inserting:");
        printLL(head);
    }
}