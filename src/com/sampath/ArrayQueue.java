package com.sampath;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    private int front = 0;
    private int rear = 0;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];

    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalArgumentException();
        items[rear] = item;
        rear=(rear+1)%items.length;
        count++;
    }

    public int dequeue() {
        if (rear == 0)
            throw new IllegalArgumentException();
        var item= items[front];
        items[front]=0;
        front=(front+1)%items.length;
        count--;
        return  item;


    }

    public int peek() {
        if (rear == 0)
            throw new IllegalArgumentException();
        return items[front];
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public boolean isFull() {
        return rear == items.length;
    }

    @Override
    public String toString(){
       return Arrays.toString(items) ;
    }


}
