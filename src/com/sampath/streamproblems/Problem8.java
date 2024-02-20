package com.sampath.streamproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem8 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 4, 5,4);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(i-> !set.add(i)).forEach(System.out::println);

    }
}
