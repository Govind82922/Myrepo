package arr;
import java.util.*;

public class max {
//  static int max() {
//	  int arr[] = {2,3,4,5,6};
//	  int ans = 0;
////	  int n = arr.length();
//	  for(int i=0; i<arr.length; i++) {
//		  if(arr[i] > ans) {
//			  ans = arr[i];
//		  }
//	  }
//	 return ans;
//  }
//  
//  public static void main(String args[]) {
//	//  System.out.println("maxi"+max());
//	  System.out.println("maximum Number = "+max());  
//  }
	
	static int maxi( int [] arr) {
	int ans = 0;
	int n = arr.length;
	
	for(int i =0; i<n; i++) {
		if(arr[i] > ans) {
			ans = arr[i];
		}
	}
	return ans;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of element of arr");
		int n = sc.nextInt();
		int []arr = new int[n];
		
		System.out.println("enter the element");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("maxium element = "+ maxi(arr));
	}
}
