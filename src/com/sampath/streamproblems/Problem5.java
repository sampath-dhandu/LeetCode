package com.sampath.streamproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem5 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Arrays.asList(6, 7, 8, 9, 10);
        Stream<Integer> stream =Stream.concat(list.stream(), list1.stream());
        stream.forEach(System.out::println);
    }
}
