package arr;

public class revesearrele {
	static int [] revrseArr (int[] arr) {
		int n = arr.length;
		int j =0; 
		int ans[] = new int [n];
		
		for(int i=n-1; i>=0; i--) {
			ans[j++] = arr[i];
		}
		return ans;
	}
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5};
		int ans[] = revrseArr(arr);
		for(int i=0; i<ans.length; i++) {
		System.out.println(ans[i]+" ");
	}
}
}
