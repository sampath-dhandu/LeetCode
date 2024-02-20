package com.sampath;

public class StringSymbol {

    public static void main(String[] args) {
        String str [] ={"--X","X++","X++"};
        System.out.println(getValue(str));
    }

    private  static int getValue(String arr[]) {

        int X = 0;
        for (String str : arr) {
            if (str.contains("+")) {
                X++;
            }
            if (str.contains("-")) {
                X--;
            }
        }
        return X;

    }
}
