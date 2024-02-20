package practise;

public class MagicIndex {
    public static void main(String[] args) {
        int arr[]= {2,1,5,6};
    System.out.println(getMagicIndex1(arr));
    }

    private static int getMagicIndex1(int arr[]){
        int magixIndex =-1;
        if (arr.length < 0)
            return  magixIndex;
        for(int i  =0 ;i < arr.length ; i ++){
            if ((i == arr[i])){
                magixIndex=i;
                return magixIndex;
            }
        }
        return  magixIndex;
    }


    private static int getMagicIndex2(int arr[], int start, int end){
        if (start <= end) {
            int mid = (start + end) / 2;
            if (mid == arr[mid]) // check for magic index.
                return mid;
            if (mid > arr[mid]) { // If mid>A[mid] means fixed point might be on
                // the right half of the array
                return getMagicIndex2(arr, mid + 1, end);
            } else {// If mid<A[mid] means fixed point might be on
                // the left half of the array
                return getMagicIndex2(arr, start, mid - 1);
            }
        }
        return -1;
    }

    }

