package com.sampath.streamproblems;

import java.util.Random;

public class RanDomProblem {

    public static void main(String[] args) {
        Random random = new Random();
        //random.ints(5, 1, 11).forEach(i -> System.out.println(i));
       // random.ints(5, 1, 11).forEach(System.out::println);

        random.ints(5, 1, 11).sorted().forEach(System.out::println);
    }
}

