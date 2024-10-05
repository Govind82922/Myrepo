package pass;
import java.util.*;

public class arr2 {
	
	static boolean checkin(int arr[]) {
		boolean check= true;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				check = false;
				break;
			}
		}
		return check;
	}
	
	
	static int lastoccurence(int[]arr,int x) {
		int lastIndex=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				lastIndex=i;
			}
		}
		return lastIndex;
		
	}
	
	static int occurence(int[] arr, int x) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of arr number");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("enter the number");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
		System.out.println(arr[i]);
	}
		
//		System.out.println("enter x");
//		int x = sc.nextInt();
//		
//		System.out.println("times of repeated "+occurence(arr,x));
//		System.out.println("last occurence index value "+lastoccurence(arr,x));
		
		System.out.println("is shorted  "+ checkin (arr));
		
}
	
}