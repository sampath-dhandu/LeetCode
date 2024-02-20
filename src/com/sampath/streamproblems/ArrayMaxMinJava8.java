package com.sampath.streamproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayMaxMinJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(list.stream().min(Comparator.comparing(Integer::valueOf)).get());
    }
}
