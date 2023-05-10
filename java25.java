import java.util.ArrayList;
// Collection Framework
public class java25 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        al1.add(2, 250);
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("Jai");
        al2.add("Veru");
        al2.addAll(al1);
        System.out.println(al2);

        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int j = 0, temp;
		for(int i = 0; i < arr.length; i++){
		    if(arr[i] < 0){
		        temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		        j++;
		    }
		}
		// int ele;
		for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
