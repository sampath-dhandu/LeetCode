package com.sampath;

import java.util.Stack;

public class QueueWithStack {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();


    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1toStack2();
        return stack2.pop();

    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1toStack2();
        return stack2.pop();

    }

    private boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void moveStack1toStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());

    }

}
