package LinkedLists;

public class MergeSortLL {

    // MAIN
    public static void main(String[] args) {

        // Creating the linked list
        Node head = new Node(4);

        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(3);

        System.out.println("Before sorting:");
        printLL(head);

        // Merge Sort
        head = mergeSortLL(head);

        System.out.println("After sorting:");
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


    // MERGE SORT
    static Node mergeSortLL(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Divide the list into two halves
        Node rightHead = slow.next;
        slow.next = null;

        // Sort left half
        Node left = mergeSortLL(head);

        // Sort right half
        Node right = mergeSortLL(rightHead);

        // Merge both sorted halves
        return merge(left, right);
    }


    // MERGE TWO SORTED LINKED LISTS
    static Node merge(Node left, Node right) {

        Node newHead = new Node(-1);
        Node temp = newHead;

        while (left != null && right != null) {

            if (left.data <= right.data) {

                temp.next = left;
                left = left.next;

            } else {

                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        // If left still has nodes
        while (left != null) {

            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        // If right still has nodes
        while (right != null) {

            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return newHead.next;
    }
}