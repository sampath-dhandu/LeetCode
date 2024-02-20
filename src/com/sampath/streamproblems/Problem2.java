package com.sampath.streamproblems;

import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().mapToInt(i -> i).sum());
    }
}
