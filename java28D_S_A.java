// Kadnies Algarithem - finding largest element in a subarray.
class java28D_S_A{
	public static void main(String[] args){
		int mini, maxi;
		int arr[] = {1, 2, 3, -2, 5};
		maxi = Integer.MIN_VALUE;
		mini = 0; 
		for(int i = 0; i < arr.length; i++){
			mini = mini + arr[i];
			if(mini > maxi)
				maxi = mini;
			if(mini < 0){
				mini = 0;
			} 
		}
		System.out.println(maxi);
	}
}
