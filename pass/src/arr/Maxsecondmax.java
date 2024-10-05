package arr;
 import java.util.*;
 public class Maxsecondmax {

   static int  small(int [] arr) {
	int mn = Integer.MAX_VALUE;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<mn) {
			mn=arr[i];
		}
	  }
	return mn;
	}



//==================================================================
//public class Maxsecondmax {
//
//	static int max(int []arr) {
//		int mx = Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>mx) {
//				mx=arr[i];
//			}
//		}
//		return mx;
//	}
//==================================================================
	
//	static int secmax(int[] arr) {
//		int mx = max(arr);
////		int n = arr.length;
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]==mx) {
//				arr[i]=Integer.MIN_VALUE;
//			}
//		}
//		int secmax = max(arr);
//		return secmax;
//	}
//===================================================================	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of arr");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("enter the  num of ele");
		for(int i=0; i<arr.length; i++) {
		arr[i] =sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");	
		}
		
//		System.out.println(max(arr));
//		System.out.println(secmax(arr));
		
		System.out.println(small(arr));
	}
	
	
	
}
