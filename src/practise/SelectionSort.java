package practise;

public class SelectionSort {

    public static void main(String[] args) {
    int arr[] = new int[] {5,3,7,4,1};
        selectionSort1(arr);
        display(arr);

    }

    private static void selectionSort (int arr[]){
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = i +1; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    private static  void display(int arr[]){
        for (int i =0 ;i < arr.length ; i ++){
            System.out.print("\t" + arr[i]);
        }
    }


    private static void  selectionSort1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = lowestIndex(arr, i);
            swapElements(arr, i, j);
        }

    }


    private  static  int lowestIndex(int arr[] , int start){
        int lowestIndex= start;
        for(int i = start ; i < arr.length ; i ++){
            if(arr[i] < arr[lowestIndex]){
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    private static void  swapElements(int arr[] ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}