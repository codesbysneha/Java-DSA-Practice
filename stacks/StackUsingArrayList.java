package stacks;

import java.util.ArrayList;

public class StackUsingArrayList {

    public static void main(String[] args) {

        StackArrayList stack = new StackArrayList();

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


class StackArrayList {

    ArrayList<Integer> list = new ArrayList<>();

    void push(int data) {
        list.add(data);
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }

        int last = list.get(list.size() - 1);

        list.remove(list.size() - 1);

        System.out.println(last);

        return last;
    }

    boolean isEmpty() {

        if (list.size() == 0) {
            return true;
        }

        return false;
    }
}