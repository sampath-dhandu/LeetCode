package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MaxMinElementArray {

    public static void main(String[] arg) {
        int[] arr = {1, 2, 1, 6, 5, 3, 2};
        System.out.println(Arrays.toString(result(arr)));
    }

    private static int[] result(int[] arr) {
        int res = 0;
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(set);
        int min2nd = 0;
        int max2nd = 0;
        int i = 0;
        while (priorityQueue.size() > 1) {
            if (i == 0) {
                int first = priorityQueue.poll();
                int second = priorityQueue.poll();
                min2nd = priorityQueue.size();
                i++;
            } else if (priorityQueue.size() == 2) {
                max2nd = priorityQueue.poll();
            } else {
                priorityQueue.poll();
            }

        }

        System.out.println(min2nd + " : " + max2nd);

        return new int[]{min2nd, max2nd};
    }

}
