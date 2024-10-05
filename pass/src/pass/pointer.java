package pass;
import java.util.*;

public class pointer {
	
	static void array(int [] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
 
	static void  swap(int a,int b, int [] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
//	
//	static int[] sort(int [] arr) {
//		int n = arr.length;
//		int count=0;
//		for(int i=0; i<n; i++) {
//			if(arr[i]==0) {
//				count++;
//			}
//			
//		}
//		
//		for(int i=0; i<n; i++) {
//			if(i<count) {
//				arr[i]=0;
//			}
//			else {
//				arr[i]=1;
//			}
//		}
//		return arr;
//		
//}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
//	static void swapzeroesones(int [] arr) {
//		int n = arr.length;
//		int left =0;
//		int right =1;
//	  
//		while(left < right) {
//			if(arr[left]==1 && arr[right]==0) {
//				swap(arr,left,right);
//				left++;
//				right--;
//		}
//			if(arr[left]==0) {
//				left++;
//			}
//			if(arr[right]==0) {
//				right--;
//			}
//	}	
//		
//	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	
	static int seperateoddeven(int [] arr) {
		int n = arr.length;
		int left=0;
		int right =n-1;
		
		while(left<right) {
			if(arr[left]%2==1 && arr[right]%2==0) {
				swap(arr,left,right);
				left++;
				right--;
				
				if(arr[left]==0) {
					left++;
				}
				
				if(arr[right]==1) {
					right--;
				}
			}
		}
	}
	
	
	
	static void print(int [] arr) {
		Scanner sc = new Scanner(System.in);
	   System.out.println("enter the size");
    	int n = sc.nextInt();
	    int [] arr = new int[n];
		System.out.println("print " + n +"element");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
	}
	
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.println("print " + n +" element");
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("classify the element");
		seperateoddeven(arr);
	}
	
	}



