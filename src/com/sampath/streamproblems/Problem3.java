package com.sampath.streamproblems;

import java.util.Arrays;
import java.util.List;

public class Problem3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().mapToInt(i->i*i).filter(square-> square > 10).average().getAsDouble());

    }
}
