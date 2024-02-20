package com.sampath.streamproblems;

import java.util.stream.IntStream;

public class Problem7 {

    public static void main(String[] args) {

        IntStream.range(1, 11).filter(i->i%2==0).forEach(System.out::println);
    }
}
