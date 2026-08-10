package stacks;

public class StackUsingLinkedList {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}


// NODE
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


// STACK
class Stack {

    Node head = null;

    // PUSH
    void push(int data) {

        if (head == null) {
            this.head = new Node(data);
        }
        else {

            Node temp = this.head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(data);
        }
    }


    // POP
    void pop() {

        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }
        else {

            Node temp = this.head;
            Node prev = temp;

            // Only one element
            if (temp.next == null) {
                System.out.println(temp.data);
                this.head = null;
                return;
            }

            // Go to last node
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }

            System.out.println(temp.data);

            // Remove last node
            prev.next = null;
        }
    }


    // IS EMPTY
    boolean isEmpty() {

        if (head == null) {
            return true;
        }

        return false;
    }
}