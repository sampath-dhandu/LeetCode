package practise;

import java.util.HashSet;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {

        System.out.print("longtest sub string"+longestSubString("abcdabacbb"));
    }

    private static  int longestSubString(String str){

        int a_pointer =0;
        int b_pointer=0;
        int max =0 ;
        HashSet<Character> characters= new HashSet<>();
        while(b_pointer < str.length())
        {
            if(!characters.contains(str.charAt(b_pointer))){
                characters.add(str.charAt(b_pointer));
                b_pointer++;
                max = Math.max(characters.size() , max);
            }else{
                characters.remove(str.charAt(a_pointer));
                a_pointer ++;
            }
        }
       return max;
    }
}
