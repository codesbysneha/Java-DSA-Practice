package LinkedLists;

public class PalindromeLL {

    // MAIN
    public static void main(String[] args) {

        // Creating the linked list
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(10);

        System.out.println("Linked List:");
        printLL(head);

        // Check if linked list is palindrome
        boolean result = palindromeLL(head);

        System.out.println("Is Palindrome: " + result);
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


    // CHECK PALINDROME
    static boolean palindromeLL(Node head) {

        // Find the middle using slow and fast
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        Node prev = null;
        Node curr = slow;
        Node next;

        while (curr != null) {

            // Save
            next = curr.next;

            // Reverse
            curr.next = prev;

            // Move prev
            prev = curr;

            // Move curr
            curr = next;
        }

        // Compare first half and reversed second half
        Node first = head;
        Node second = prev;

        while (first != null && second != null) {

            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}