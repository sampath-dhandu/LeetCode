package com.sampath;

import java.util.ArrayList;
import java.util.List;

public class ArrayPairSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(12);
        getSortedCount(list);
    }

    private static int getSortedCount(List<Integer> list) {

        if (list == null && list.size() == 0)
            return -1;
        int j = 1;
        int sum = 0;
        List<Integer> result = new ArrayList<>();

        //5 , 4, ,3 ,2, 1
        //[5, 7, 3, 2, 1]
        //int sum =0;
        //5 , j = 4
        //7 , 3
        for (int i = 0; i < list.size(); i++) {
            if (list.get(j) < list.get(i)) {
                if( sum >=list.get(i)){
                    sum += list.get(j) ;
                    list.add(i, sum);
                    list.remove(j);
                    list.remove(j+1);
                    sum=0;
                }else{
                    sum += list.get(j) + list.get(j+1);
                    list.add(j, sum);
                    list.remove(j + 1);
                    list.remove(j + 2);
                    j++;
                }
            }else{
                list.remove(i);
                j++;
            }
            System.out.println(list);
        }
        return 0;

    }
}
