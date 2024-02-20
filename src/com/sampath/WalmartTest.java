package com.sampath;


import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * <p>
 * Given an integer array nums and an integer k, return true
 * * if nums has a continuous subarray of size at least two whose
 * * elements sum up to a multiple of k, or false otherwise.* *
 * --------------
 * Input: nums = [23,2,4,6,7], k = 6
 * Output: true
 * Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6
 * <p>
 * Example 2:
 * ------------
 * Input: nums = [23,2,6,4,7], k = 6
 * Output: true
 * Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
 * 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer
 * <p>
 * Example 3:
 * ---------------
 * Input: nums = [23,2,6,4,7], k = 13
 * Output: false
 */

public class WalmartTest {

    public static void main(String[] args) {

        int arr[] = {23, 2, 4, 6, 7};

        System.out.println("result :" + isValid1(arr, 6));

    }

    private static boolean isValid(int arr[], int key) {
        int size = arr.length;
        if (size == 0 || size < 2)
            return false;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
            for (int j = i + 1; j < size; j++) {
                sum += arr[j];
                if (sum % key == 0) {
                    System.out.println(sum);
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isValid1(int arr[], int key) {
        if (arr.length == 0 || arr.length < 2)
            return false;
        Map<Integer, Integer> newMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(sum);
            System.out.println(newMap);
            if (!newMap.containsKey(sum % key)) {
                newMap.put(sum % key, i + 1);
            } else if (newMap.get(sum % key) < i)
                return true;
        }
        return false;
    }

}
