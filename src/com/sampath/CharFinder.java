package com.sampath;

import java.util.HashSet;
import java.util.Set;

public class CharFinder {

    public char findFirstRepetChar(String input) {

        Set<Character> hashSet = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (hashSet.contains(ch))
                return ch;
            hashSet.add(ch);

        }

        return Character.MIN_VALUE;
    }
}
