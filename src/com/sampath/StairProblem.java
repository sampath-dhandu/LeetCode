package com.sampath;

public class StairProblem {
    public static void main(String[] args) {
        System.out.println(get(7));
    }


    public  static int get(int stairs){
        int prev1= 1;
        int prev2=1;
        int current=0;

        for (int i =2; i<=stairs ; i++){
            current=prev1+prev2;
            prev1=prev2;
            prev2=current;
        }
        return prev2;
    }
}
