package com.sampath;

import java.util.Arrays;
import java.util.Vector;

public class ArrayPermutation {

    public static void main(String[] args) {

        int nums[] = new int[]{5,0,1,2,3,4};

        display(permutation(nums));


    }

    public static int [] permutation(int arr[]){
        int nums[] = new int[arr.length];
        for(int i = 0 ; i< arr.length ; i ++){
            nums[i]=arr[arr[i]];

            System.out.println(arr[arr[i]]);

        }

        return  nums;
    }

    private static void display(int arr[]){

        for(int i = 0; i < arr.length ; i++){
            //System.out.println(arr[i]);
        }
    }



}
