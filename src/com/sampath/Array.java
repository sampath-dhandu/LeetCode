package com.sampath;

public class Array {

    private int arr[];
    int count;

    public Array(int size) {
        arr = new int[size];
    }

    public void insert(int number) {
        if (arr.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = arr[i];
            arr = newItems;
        }
        arr[count++] = number;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++)
            arr[i] = arr[i + 1];
        count--;
    }

    public int indexOff(int number) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int max() {
        int max = arr[0];
        for (int i = 0; i < count; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public int[] reverse() {
        int rev[] = new int[count];
        int j = 0;
        for (int i = count - 1; i >= 0; i--)
            rev[j++] = arr[i];
        return rev;
    }
}