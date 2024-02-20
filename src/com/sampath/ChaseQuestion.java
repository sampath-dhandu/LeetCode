package com.sampath;

import java.util.HashMap;
import java.util.Map;

public class ChaseQuestion {


    public static void main(String[] args) {
        //15,12,8,6,30
        //target =26

        int arr[] = {15, 12, 8, 6, 30};
        System.out.println(getArray(arr, 26));

    }

    private static int getArray(int arr[], int taget) {
        int length = arr.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
            System.out.println(sum - taget);
            if (numMap.containsKey(sum - taget)) {
                result += numMap.get(sum - taget);
            } else {
                numMap.put(sum, numMap.getOrDefault(sum, 0) + 1);
            }
        }
        System.out.println(numMap);
        System.out.println(result);
        return result;

    }

    private static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + "");
        }
    }
}
