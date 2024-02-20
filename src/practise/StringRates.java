package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringRates {

    public static void main(String[] args) {

        String strRates="5.0,100,5.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20;";

        String arr[] = strRates.split(":");

        String[][] matrix = new String[arr.length][];
        Map<String,Object> newMap =new HashMap<String,Object>();
        int r = 0;
        for(String str : arr){
            //System.out.println(str);
            if(str.contains(";")){
                String strLevel[]=str.split(";");
                for(int i = 0 ; i < strLevel.length ; i ++){
                    System.out.println(strLevel[i]);
                }
            }else {
                matrix[r++] = str.split(";");
            }

        }
        System.out.println(Arrays.deepToString(matrix));

        }
}
