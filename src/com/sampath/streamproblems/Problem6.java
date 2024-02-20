package com.sampath.streamproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 4, 5,4);
        List<Integer> lis2=list.stream().distinct().collect(Collectors.toList());
        lis2.stream().forEach(System.out::println);
    }
}
