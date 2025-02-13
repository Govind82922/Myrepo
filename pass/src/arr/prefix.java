package arr;
import java.util.*;

public class prefix {
	
	static void printarr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int[] prefixsum(int[] arr) {
		int n = arr.length;
		int pre[] = new int[n];
		pre[0] = arr[0]; // it's show the arr[0] index get not add with other index arr
		
		for(int i=1; i<n; i++) {
			pre[i] = pre[i-1]+arr[i];
		}
		return pre;
	}
	
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the n arr");
		int n = sc.nextInt();
		 int arr[] = new int[n];   // 
		 
		 System.out.println("Enter the"+n+ " element");
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("Input array");
		 printarr(arr);
		 
		 int[] pre = prefixsum(arr);
		 System.out.println("prefix sum array");
		 printarr(pre);
		 
	}
}
