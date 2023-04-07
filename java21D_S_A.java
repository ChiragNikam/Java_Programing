// Sorting in Arrays
public class java21D_S_A {
    public static void main(String[] args) {
        int arr[] = {89, 23, 21, 43, 12};
        if(arr.length == 0)
            System.out.println("-1");
        else
            selectionSort(arr);
        for(int ele : arr)
            System.out.println(ele);
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int sma = smallest(arr, arr.length - 1, i);
            int temp = arr[i];
            arr[i] = arr[sma];
            arr[sma] = temp;
        }
    }
    public static int smallest(int[] arr, int size, int s){
        int index = s;
        int min = arr[s];
        for(int i = s+1; i <= size; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}