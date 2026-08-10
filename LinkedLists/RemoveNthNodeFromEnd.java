package LinkedLists;

public class RemoveNthNodeFromEnd {

    // MAIN CLASS
    public static void main(String[] args) {

        // Creating nodes and connecting them
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before removing:");
        printLL(head);

        // Remove 2nd node from the end
        head = removeLL(head, 2);

        System.out.println("After removing:");
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


    // REMOVE NTH NODE FROM END
    static Node removeLL(Node head, int n) {

        int len = lengthLL(head);

        int n2 = len - n;

        int c = 0;

        Node temp = head;

        // If we have to remove the first node
        if (n2 == 0) {
            head = temp.next;
            return head;
        }

        // Find the node before the node we want to remove
        while (temp.next != null) {

            if (c + 1 == n2) {

                // Remove the node
                temp.next = temp.next.next;

                return head;
            }

            temp = temp.next;
            c++;
        }

        return head;
    }


    // LENGTH OF LINKED LIST
    static int lengthLL(Node head) {

        Node temp = head;

        int count = 0;

        while (temp != null) {

            temp = temp.next;
            count++;
        }

        return count;
    }
}