package com.sampath.streamproblems;

import java.util.Calendar;
import java.util.HashSet;

public class RemoveDuplicateInString {

    public static void main(String[] args) {

    System.out.println(removeDuplicates("gggghads"));

    }

    private static String removeDuplicates(String str){

        HashSet<Character> stringMap= new HashSet<>();

        for(char ch : str.toCharArray()){
            stringMap.add(ch);
        }

        StringBuilder sb= new StringBuilder();

        for(Character ct: stringMap){
            sb.append(ct);
        }

        return  sb.toString();
    }
}
