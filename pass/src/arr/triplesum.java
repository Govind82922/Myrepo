package arr;
import java.util.*;

public class triplesum {

//	static int uniquenumber (int []arr) {
//		int n = arr.length;
//		for(int i=0; i<n; i++) {
//			for(int j=i+1; j<n; j++) {
//				if(arr[i] == arr[j]) {
//					arr[i]=-1;
//					arr[j]=-1;
//				}
//			}
//		}
//		int ans=-1;
//	}
	
	
//	static int triplesum(int[]arr, int target) {
//		int n = arr.length;
//		int ans = 0;
//		
//		for(int i=0; i<n; i++) {
//			for(int j=i+1; j<n; j++) {
//				for(int k=j+1; j<n; k++) {
//					if(arr[i]+ arr[j]+arr[k]==target) {
//						ans++;
//				}
//			}
//		}
//		
//	}
//		return ans;
//}
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter the arr");
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//			
//			System.out.println("enter the "+n+ "element");
//			for(int i=0; i<n; i++) {
//				arr[i]=sc.nextInt();
//				
////				System.out.println("enter the sum");
////				int target = sc.nextInt();
//				
////				System.out.println(triplesum(arr,target));
//				
//				System.out.println(uniquenumber(arr));
//			}
//		}
// ====================================================================
//	 static void swap ( int arr[], int i, int j) {
//     int n = arr.length;
//	 int temp = arr[i];
//	 arr[i] = arr[j];
//	 arr[j] = temp;
//	 
//	 }
//	public static void main(String args[]) {
//		  Scanner sc = new Scanner( System.in);
//		   
//		  System.out.println("enter the element of arr");
//		  int n = sc.nextInt();
//		  int arr [] = new int[n];
//		  
//		  System.out.println("enter the"+n+"element of arr");
//		  for(int i=0; i<n; i++) {
//			  arr[i] = sc.nextInt();
//		  }
//	  }
	
// ======================================================================
//	static void printArray(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//	}
//	
//	static int[] reverseArray(int[] arr){
//		int n = arr.length;
//		int ans[] = new int[n];
//		int j =0;
//		
//	// traverse original array
//		for(int i=n-1; i>=0; i--) {
//			ans[j++] = arr[i];
//		}
//		return ans;
//	}
//	
//	public static void main(String args[]) {
//    Scanner sc = new Scanner(System.in);
////     
//    System.out.println("enter the no of arr element");
//      int n = sc.nextInt();
//     int[] arr = new int[n]; 
//     
//     System.out.println("enter your arr element  ");
//      for(int i=0;i<arr.length;i++) {
//    	   arr[i]=sc.nextInt();
//      }
//
////		int[] arr = {1,2,3,4,5};
//      
//		int[] ans = reverseArray(arr);
//		printArray(ans);
//		
//	}
//===================================================================
	
//      ***********SWAP TWO INTEGERS*********
	
	static void swap( int a, int b) {
		System.out.println("before the swap");
		System.out.println("a:"+ a);
		System.out.println("b:"+b);
		
		int temp = a;
		a=b;
		b=temp;
		
		
		 
		 
		 System.out.println("after the swap");
			System.out.println("The value of a:"+ a);
			System.out.println("the value of b:"+b);
		 
	}	
		public static void main(String args[]) {
			int a=1;
			int b=3;
			int arr[]  = {1,2,3,4,5};
			swap(a,b);
		}
	}
	

