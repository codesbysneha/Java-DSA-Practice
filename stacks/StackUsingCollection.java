package stacks;

import java.util.Stack;

public class StackUsingCollection {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // PUSH
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // PEEK
        System.out.println("Top element: " + stack.peek());

        // POP
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // PEEK
        System.out.println("Top element: " + stack.peek());

        // POP
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // POP
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop: " + stack);


        // EDGE CASE
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        }
    }
}