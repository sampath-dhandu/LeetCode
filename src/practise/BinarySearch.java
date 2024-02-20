package practise;

public class BinarySearch {

    public static void main(String[] args) {
        int arr [] ={1,2,3,5,6};
        System.out.print(search(arr,0, arr.length -1 , 6));
    }


    private static int search(int arr[], int start , int end, int searchElement){
        if (start <= end) {
            int mid = (start + end) / 2;
            System.out.println(("mid : " + mid + "start : " + start + " end : " + end));
            if (arr[mid] == searchElement)
                return mid;
            if (searchElement > arr[mid]) {
                return search(arr, mid + 1, end, searchElement);
            } else {
                return search(arr, start, mid - 1, searchElement);
            }
        }
        return  -1;
    }
}
