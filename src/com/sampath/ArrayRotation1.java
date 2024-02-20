package com.sampath;

import java.util.Arrays;
import java.util.List;

public class ArrayRotation1 {

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
      int reverse[]=  reverseArray(arr);

      for(int i = 0; i < reverse.length ;i++){
          System.out.println(reverse[i]);
      }


    }

    public static int [] reverseArray(int arr[]){
        int length= arr.length  ;
        int reverse[] = new int[length];
        if(length < 0)
            return new int[] {-1, 01};
        int j =0;
        for (int i=length-1; i >=0; i--){
            reverse[j]=arr[i];
            j++;
        }
        return reverse;
    }

}
