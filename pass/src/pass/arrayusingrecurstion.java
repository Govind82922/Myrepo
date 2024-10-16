package pass;

public class arrayusingrecurstion {

	static int sumofarray(int []arr, int idx) {
		if(idx==arr.length) {
			return 0;
		}
		//recursive work
		int smallans = sumofarray(arr,idx+1);
		
		// small work
		return smallans + arr[idx];
	}
	
	
	
public static void main(String[] args) {
	int[] arr = {1,2,3,4,3};
	System.out.println(sumofarray(arr,0));
}
}
