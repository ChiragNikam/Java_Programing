// Advanced for loop
public class java10 {
    public static void main(String[] args) {
        int arr[] = { 45, 34, 78, 33 }; // Declearing an array in java.
        for (int i = 0; i < 4; i++)
            System.out.println(arr[i]);
        System.out.println(arr.length);
        
        int arr1[] = new int[5]; // Declearing an array using new keyword.
        for (int i = 0; i < 5; i++)
            arr1[i] = i + 1;    // Assigning values to arr1.
        for (int i = 0; i < 5; i++)
            System.out.println(arr1[i]);

        System.out.println("arr1 using Enhanced for loop : ");

        for (int n : arr1) { // Syntax of enhanced for loop.
            System.out.println(n);
        }
    }
}
