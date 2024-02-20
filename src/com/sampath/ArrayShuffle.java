package com.sampath;

import java.util.Arrays;
import java.util.List;

public class ArrayShuffle {

    public static void main(String[] args) {

        int arr[]= {2,5,1,3,4,7};
        display(shuffle(arr,3));

    }

    private static int[] shuffle(int[] nums, int n) {
        int mid = nums.length /n;
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[mid*i]= nums[i];
            ans[mid*i+1]= nums[n+i];
        }
        return ans;
    }

private static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
}
}

