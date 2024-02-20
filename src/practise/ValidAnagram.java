/**
 *
 */
package practise;

import java.util.Arrays;

/**
 * @author sampathdhand
 */
public class ValidAnagram {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "anagram";
        String t = "nagaram";
        System.out.println("isAnagram " + new ValidAnagram().isAnagram2(s, t));
    }

    private boolean isAnagram1(String s, String t) {
        if (null == s || t == null && (s.length() != t.length()))
            return false;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return Arrays.equals(schar, tchar);
    }

    private boolean isAnagram2(String s, String t) {
        if (null == s || t == null && (s.length() != t.length()))
            return false;

        int[] count = new int[26];
        if (!isLetter(s) || !isLetter(t))
            return false;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;

    }

    private boolean isLetter(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // checks whether the character is not a letter
            // if it is not a letter ,it will return false
            if ((Character.isLetter(s.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
}
