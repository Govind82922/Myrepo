package pass;
import java.util.*;
public class questions {

//  static int occurence(int arr[],int x) {
//	int count=0;
//	 for(int i=0; i<arr.length; i++) {
//		 if(arr[i]==x) {
//			 count++;
//		 }
//	 }
//	 return count; 
// }
  
//  static int lastoccurence(int[] arr, int x) {
//	    int lastIndex=-1;
//	    for(int i=0; i<arr.length; i++) {
//		if(arr[i]==x) {
//			lastIndex=i;
//		}
//	  }
//	    return lastIndex;
//  }
//  
  static boolean sorted(int [] arr) {
	  boolean check = true;
	  
	  for(int i=1; i<arr.length; i++) {
		  if(arr[i] < arr[i-1]) {
			  check = false;
		 
			  break;
	  }
  }
      return check;
} 
  

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("enter the size");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	System.out.println("enter the element");
	for(int i=1; i<arr.length; i++) {
	arr[i] = sc.nextInt();
	}
	
	
	for(int i=0; i<n; i++) {
		System.out.println(arr[i]+" ");
	}
	
//	System.out.print("enter the x");
//	int x = sc.nextInt();
	//int x;
	//System.out.println("the repeated element "+occurence(arr,x));
	//System.out.println("the lastIndex element "+lastoccurence(arr,x));
	System.out.println(" the element of arr is "+sorted(arr));
    //sorted(arr);	
}
	
	
}
