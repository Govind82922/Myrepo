package array;
import java.util.*;

public class arry2_2 {

	static int countarrelement(int arr[],int x) {
	int	count =0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==x) {
			count++;
		}
		
	}
	return count;
	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number array");
		int n = sc.nextInt();
		int []arr = new int [n];
		
		System.out.println("enter the arr element");
		for(int i=0; i<arr.length; i++) {
		 arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
	System.out.println("enter the x");
	int x = sc.nextInt();
	System.out.println(countarrelement(arr, x));
	}
	
}
