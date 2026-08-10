package LinkedLists;
public class addFirstinLL {

    // Class variable (shared by all methods)
    static Node head;

    // Blueprint of a Node
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Initialize the linked list
        head = new Node(10);

        System.out.println(head);
        System.out.println(head.next);
        System.out.println(head.data);

        // Add another node manually
        Node newNode = new Node(20);
        //Linking the code
        head.next = newNode;
        System.out.println(newNode.data);

        // Add a node at the beginning
        addFirst(8);

        // Check the linked list
        System.out.print("Head:" + head.data);
        System.out.print("Second:" + head.next.data);
        System.out.println("Third:" + head.next.next.data);
        Node temp=head;
        System.out.println("After adding the number using while loop instead of print statements");
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    static void addFirst(int data) {
        Node newNode = new Node(data);

        // New node points to the current head basically it links newnode to head 
        newNode.next = head;

        // Head now points to the new node
        head = newNode;
    }
}    
