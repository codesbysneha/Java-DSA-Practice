package LinkedLists;

public class AddLastInLL {

    // Head stores the address of the first node
    static Node head;

    // Blueprint for creating a node
    static class Node {
        int data;
        Node next;

        // Constructor to initialize a node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node at the end of the linked list
    static void addLast(int data) {

        // Create a new node with the given data
        Node newNode = new Node(data);

        // If the linked list is empty,
        // make the new node the head and stop the method
        if (head == null) {
            head = newNode;
            return;
        }

        // Create a temporary pointer to traverse the list
        Node temp = head;

        // Traverse until temp reaches the last node
        // (The last node's next is null)
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the last node to the new node
        temp.next = newNode;
    }

    // Method to print the linked list
    static void printList() {

        // Temporary pointer starts from head
        Node temp = head;

        // Traverse the entire linked list
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        // Indicates the end of the linked list
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create the first node of the linked list
        head = new Node(10);

        // Add nodes at the end
        addLast(20);
        addLast(30);
        addLast(40);

        // Print the complete linked list
        printList();
    }
}
