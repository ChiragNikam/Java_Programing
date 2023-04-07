// Divide and Conquer Techniques
public class java23D_S_A {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, -4, 243, 89, -54};
        mergSort(arr, 0, arr.length - 1);
        print(arr);
    }
    public static void mergSort(int arr[], int si, int ei){
        // base case
        if(si >= ei)
            return;
        int mid = si + (ei - si)/2;
        String str = new String();

        //kam
        mergSort(arr, si, mid);
        mergSort(arr, mid + 1, ei);

        merg(arr, si, mid, ei);
    }
    public static void merg(int arr[], int si, int mid, int ei){
        int i, j, k;    // iterators 
        int[] temp = new int[ei - si + 1];
        i = si;
        j = mid + 1;
        k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            } else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
            // k++;
        }
        while(j <= ei){
            temp[k++] = arr[j++];
            // k++;
        }
        for(i = si, k = 0 ; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
