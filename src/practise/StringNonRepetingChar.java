package practise;

import java.util.HashMap;
import java.util.Map;

public class StringNonRepetingChar {

    public static void main(String[] args) {
        System.out.print(nonRepatCharacter2("aaabccddeef"));
    }
    private static  char nonRepatCharacter(String str ){
            for(int i = 0; i < str.length() ; i ++){
                boolean stringRepeat = false;
                for(int j =0 ; j < str.length() ; j++){
                    if(str.charAt(i) == str.charAt(j) && (i != j)){
                        stringRepeat =true;
                        break;
                    }
                }
                if(!stringRepeat) return str.charAt(i);
            }
        return '-';
    }

    private static char nonRepatCharacter1(String str ){
        Map<Character,Integer> tempMap= new HashMap<Character,Integer>();
        for(int i = 0; i < str.length() ; i ++){
            char c = str.charAt(i);
            if(tempMap.containsKey(c)){
                tempMap.put(c, tempMap.get(c) + 1);
            }else {
                tempMap.put(c,   1);
            }
        }
        for(int i = 0; i < str.length() ; i ++) {
            char c = str.charAt(i);
            if(tempMap.get(c) ==1){
                return c;
            }
        }
        return '-';
    }


    private static char nonRepatCharacter2(String str ){
        Map<Character,Integer> tempMap= new HashMap<Character,Integer>();
        int [] char_counts = new int[26];
        for(char ch : str.toCharArray()){
            char_counts[ch - 'a']++;
        }
        for(char ch : str.toCharArray()){
            if(char_counts[ch - 'a'] ==1 ) return  ch;
        }
        return '-';
    }
}
