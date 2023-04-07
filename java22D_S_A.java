// Backtracking - going in reverse direction in an array
public class java22D_S_A {
    public static void main(String[] args) {
        // Backtracking in array:
        int arr[] = { 1, 2, 3, 4, 5 };
        numbers(arr, 0);
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        System.out.println("Subset of a string : ");

        // Finding all subsets of a string:
        String str = new String("abc");
        subsets(str, "", 0);
        System.out.println();

        // Quick Sort
        System.out.println("Sorted Array : ");
        int[] arr1 = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr1, 0, arr1.length - 1);
        printArray(arr1);
    }

    // Functions to backtrack an array in recursion and sub all elements by 2.
    public static void numbers(int[] arr, int i) {
        if (i == arr.length) // Base case
            return;

        System.out.print(arr[i] + " ");
        numbers(arr, i + 1); // kam
        arr[i] = arr[i] - 2; // backtracking
    }

    // Functions to find subsets of the given string
    public static void subsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0)
                System.out.print("{null}");
            else
                System.out.print("{" + ans + "}, ");
            return;
        }

        // Yes
        subsets(str, ans + str.charAt(i), i + 1); // kam

        // No
        subsets(str, ans, i + 1); // backtracking
    }

    // Functions to find permutations

    // Functions to Sort an array using Quick Sort
    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei)
            return;

        int pvt_idx = pivot(si, ei, arr);

        // to sort left part of the pivot element.
        quickSort(arr, si, pvt_idx - 1);
        // to sort right part of the pivot element.
        quickSort(arr, pvt_idx + 1, ei);
    }

    public static int pivot(int si, int ei, int[] arr) {
        int i = si - 1, temp, j;
        int pvt = arr[ei];
        for (j = si; j <= ei; j++) {
            if (arr[j] < pvt) {
                // this will arrange smaller element then pivot on its left
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // to get pivot element on its wright place.
        i++;
        temp = pvt;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    // to print an array
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
