package com.sampath;

import java.util.Arrays;

public class StackArray {

    private final int[] items = new int[5];
    private int counter;

    public void push(int item) {
        if (counter == items.length)
            throw new StackOverflowError();
        items[counter++] = item;
    }

    public int pop() {
        if (counter == 0)
            throw new IllegalStateException();
        return items[--counter];
    }

    public int peek() {
        if (counter == 0)
            throw new IllegalStateException();
        return items[counter - 1];

    }

    @Override
    public String toString() {
        var conten = Arrays.copyOfRange(items, 0, counter);
        return Arrays.toString(conten);

    }
}

