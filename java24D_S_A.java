// finding pivot element in a sorted and rotated array.
class Solution {
    public int search(int[] arr, int target) {
        int s = 0, pos, e = arr.length - 1;
        int pvt = getPivot(arr, e);  // to get the pivote element from where array is been rotated.
        int mid = s + (e-s)/2;
        
        // below case means that the mid lies on line2.
        if((target > arr[pvt]) && (target < arr[e]))
            pos = binarySearch(arr, pvt, e, target);  // to search element on line2 using binary search.
        else  // this case for mid at line1. 
            pos = binarySearch(arr, s, pvt-1, target);  // to search element on line1 using binayr search.
        
        return pos;
    }
    public int getPivot(int[] arr, int e){
        int s = 0;
        int mid = s + (e-s)/2;
        while(s < e){
            if(arr[mid] >= arr[0])
                s = mid + 1;
            else
                e = mid;
            mid = s + (e-s)/2;
        }
        return s;
    }
    public int binarySearch(int[] arr, int s, int e, int target) {
        int mid = s + (e - s) / 2;
        while (s <= e) {

            if (target > arr[mid])
                s = mid + 1;
            else
                e = mid - 1;

            if (target == arr[mid])
                return mid;

            mid = s + (e - s) / 2;
        }
        return -1;
    }
}
public class java24D_S_A {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2,4, 5, 6 };
        int arr1[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 20};
        // System.out.print("Position of Pivot element : ");
        // System.out.println(getPivot(arr, arr.length - 1));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 7));
        // Solution s = new Solution();
        // System.out.println( s.search(arr, 2));
    }

    public static int getPivot(int arr[], int e) {
        int s = 0;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (arr[mid] > arr[0])
                s = mid + 1;
            else
                e = mid;
            mid = s + (e - s) / 2;
        }
        return s;
    }

    public static int binarySearch(int arr[], int s, int e, int target) {
        int mid = s + (e - s) / 2;
        while (s <= e) {

            if (target == arr[mid])
                return mid;
            
            if (target > arr[mid])  // go to right part
                s = mid + 1;
            else  // go to left part
                e = mid - 1;

            mid = s + (e - s) / 2;
        }
        return -1;
    }
}
