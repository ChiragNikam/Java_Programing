// Kadnies Algarithem - finding largest element in a subarray.
class java28D_S_A{
	public static void main(String[] args){
		int mini, maxi;
		int arr[] = {1, 2, 3, -2, 5};
		maxi = mini = arr[0];
		for(int i = 1; i < arr.length; i++){
			mini = mini + arr[i];
			if(mini > maxi)
				maxi = mini;
			else if(arr[i] < 0){
				mini = 0;
				if(maxi > 0)
					maxi = maxi + arr[i];
			} else
				maxi = maxi + arr[i];
		}
		System.out.println(maxi);
	}
}
