package com.sampath;

import java.util.HashMap;
import java.util.Map;

public class StringRepetChar {

    public char nonRepetedChar(String input) {
        Map<Character, Integer> newMap = new HashMap<>();
        char[] toChar = input.toCharArray();
        for (char ch : toChar) {
            var count = newMap.containsKey(ch) ? newMap.get(ch) : 0;
            newMap.put(ch, count + 1);
        }
        for (char ch : toChar) {
            if (newMap.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        StringRepetChar stringRepetChar= new StringRepetChar();
        System.out.println(stringRepetChar.nonRepetedChar("hello"));
    }
}
