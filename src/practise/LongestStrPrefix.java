package practise;

import java.util.List;

public class LongestStrPrefix {

    public static void main(String[] args) {
        String art[] = {"apple", "ape", "apricot"};
        System.out.println(commonPrefix(art));
    }


    private static String commonPrefix(String[] strList) {
        if (strList.length == 0)
            return "";
        String prefix = strList[0];
        for (int i = 1; i < strList.length; i++) {
            while (strList[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}


