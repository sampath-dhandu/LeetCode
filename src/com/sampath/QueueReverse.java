package com.sampath;

import java.util.Queue;
import java.util.Stack;

public class QueueReverse {

    public void reverse(Queue<Integer> queue) {
        //add
        //remove
        //empty
        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()) {
            int front = queue.remove();
            System.out.println(front);
            st.push(front);
        }
        while (!st.isEmpty()) {
            queue.add(st.pop());
        }
        System.out.println(queue);
    }
}
