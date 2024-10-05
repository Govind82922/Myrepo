package arr2;
import java.util.*;

public class lastoccurence {
//static int key(int arr[] , int x) {
//	int n = arr.length;
//	int count =0;
//	for(int i=0; i<n; i++) {
//		if(arr[i]==x) {
//			count++;
//		}
//	}
//	return count;
//	
//}
	
//	static boolean issorted(int[] arr) {
//		boolean check=true;
//	    for(int i=1;
//	    		i<arr.length;i++) {
//			if(arr[i]<arr[i-1]) {
//				check = false;
//			}
//		}
//		return check;
//	}
	
//	static void smalllargest(int arr[]) {
//		Arrays.sort(arr);
//		int n = arr.length;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]<arr[n-1]) {
//			int	swap()
//			}
//			System.out.println(arr[i]);
//		}
//	}
	//========================================================
	
//	static int[] ultaarr(int arr[]) {
//		int n = arr.length;
//		int [] ans = new int[n];
//		int j=0;
//// original arr in reverse direction
//		
//		for(int i= n-1; i>=0; i--) {
//			ans[j]=arr[i];
//			j++;
//		}
//		return ans;
//	}

//==============================================================
	
	
	
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of arr");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("enter the "+n+" elemnt");
		
		for(int i=0; i<n; i++) 
		{
		    arr[i] = sc.nextInt();
		}
		
		//System.out.println(issorted(arr));
		//key(arr,x);
		smalllargest(arr);
		//System.out.println(ultaarr(arr));
//		int result[]= lastoccurence.ultaarr(arr);
//		for(int data:result)
//			System.out.println(data);
}
	
}