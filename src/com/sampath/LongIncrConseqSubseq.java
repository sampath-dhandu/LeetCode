package com.sampath;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongIncrConseqSubseq {
    public static void main(String[] args) {

        int arr[] = {9,8,7,6,1,2,5,9,10,-1,0,-2};
        System.out.println(longest(arr));

    }

    private static int longest(int arr[]){

        Map<Integer,Integer> map = new HashMap<>();
        map.put(arr[0], 1);
        map.put(arr[0], 1);
        for (int i = 1; i < arr.length; i++) {
            // check if last consequent of arr[i] exist or not
            if (map.containsKey(arr[i] - 1)) {
                // put the updated consequent number
                // and increment its value(length)
                map.put(arr[i], map.get(arr[i] - 1) + 1);
                // remove the last consequent number
                map.remove(arr[i] - 1);
            }
            // if their is no last consequent of
            // arr[i] then put arr[i]
            else {
                map.put(arr[i], 1);
            }
            System.out.println(map);
        }
        return Collections.max(map.values());
    }
}


