package com.sampath;

import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {

    public static void main(String[] args) {

        List<Integer> a =new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(getReverse(a));
    }


    public static List<Integer> getReverse(List<Integer> a){
        List<Integer> rev=new ArrayList<>();
        int size = a.size();
        System.out.println(size);
        System.out.println(a);
        for(int i = size-1; i >=0 ; i--){
            rev.add(a.get(i));
        }
     return rev;
    }

}
