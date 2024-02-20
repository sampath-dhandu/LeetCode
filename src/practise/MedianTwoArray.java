package practise;

import java.util.Map;
import java.util.TreeMap;

public class MedianTwoArray {

    public static void main(String[] args) {

        int arr1[]= {1,2};
        int arr2[] ={3,4};
        getMedianArray(arr1,arr2);

    }

    /**
     * Input: nums1 = [1,3], nums2 = [2]
     * Output: 2.00000
     * Explanation: merged array = [1,2,3] and median is 2.
     * Example 2:
     *
     * Input: nums1 = [1,2], nums2 = [3,4]
     * Output: 2.50000
     * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

     * @param arr1
     * @param arr2
     * @return
     */
    private static int getMedianArray(int arr1[] , int arr2[]){

        if(arr1.length < 0 || arr2.length < 0)
            return -1;

        Map<Integer,Boolean> testMap = new TreeMap<Integer,Boolean>();
        for (int i =0 ;i < arr1.length ; i++){
            testMap.put(arr1[i],true);
        }
        for (int i =0 ;i < arr2.length ; i++){
            testMap.put(arr2[i],true);
        }


        for (Map.Entry<Integer,Boolean> me : testMap.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }

        return -1;
    }
}
