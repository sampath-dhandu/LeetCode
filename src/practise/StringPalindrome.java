package practise;

import java.util.Stack;

public class StringPalindrome {

    public static void main(String[] args) {
        String str = "MADAM1";
        System.out.println(isPalindrome2(str));
    }

    /**
     * \
     *
     * @param str
     * @return
     */
    private static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            stack.add(ch);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString().equals(str);
    }

    /**
     * @param str
     * @return
     */
    private static boolean isPalindrome1(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        return rev.equals(str);
    }

    private static boolean isPalindrome2(String str) {

        int length = str.length() - 1;
        int startPostion = 0;
        while ((startPostion < length)) {
            if (str.charAt(startPostion) != str.charAt(length))
                return false;
            length--;
            startPostion++;

        }
        return true;
    }
}
