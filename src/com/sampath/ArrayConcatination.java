package com.sampath;

public class ArrayConcatination {

    public static void main(String[] args) {

        int arr[] = {1,2,3};
        display(concatate(arr));

    }

    private static int [] concatate (int arr[]){

        int size = arr.length ;
        int results []= new int[arr.length * 2] ;
        System.out.println(size);
        for(int i =0 ; i < arr.length; i ++){
            results[i] = arr[i];
        }
        for(int i =0 ; i < arr.length; i ++){
            results[i+size] = arr[i];
        }
        return results;
    }

    private static void display(int arr[]){

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
