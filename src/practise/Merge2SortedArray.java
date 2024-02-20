package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Merge2SortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

      //  display(get(arr1, arr2));

       // Time Complexity : O(n1 + n2)
       // Auxiliary Space : O(n1 + n2)

        mergeArray(arr1, arr2);

       // Time Complexity: O( nlog(n) + mlog(m) )
      //  Auxiliary Space: O(N)
    }
    private static int[] get(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
        return arr3;
    }


    private static void mergeArray(int arr1[] , int arr2[]){

        Map<Integer,Boolean> mergeMap = new TreeMap<>();
        for(int i = 0 ; i < arr1.length ; i++){
            mergeMap.put(arr1[i], true);
        }

        for(int j = 0 ; j < arr2.length ; j++){
            mergeMap.put(arr2[j], true);
        }

        for (Map.Entry<Integer,Boolean> me : mergeMap.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }

    private static void display(int[] arr3) {
        for (int n : arr3) {
            System.out.print(n + " ");
        }
    }


}
