package com.sampath.streamproblems;

import java.util.Arrays;
import java.util.List;

public class Problem4 {

    public static void main(String[] args) {
        List<String> strignList = Arrays.asList("abc", "abcd", "abcded", "abcdefg");
        strignList.stream().filter(str-> str.length() > 4).forEach(System.out::println);
        System.out.println(strignList.stream().filter(str-> str.length() > 4).count());
    }
}
