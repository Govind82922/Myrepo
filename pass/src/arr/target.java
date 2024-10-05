package arr;
import java.util.Scanner;

public class target {
	static int max(int []arr) {
		int mx = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>mx) {
				mx=arr[i];
			}
		}
		return mx;
	}
	
	
	static int secmax(int[] arr) {
		int mx = max(arr);
//		int n = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==mx) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int secmax = max(arr);
		return secmax;
	}
	
	
//=======================================================================
//	static void uniqueNum(int []arr) {
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					arr[i]= -1;
//					arr[j]=-1;
//				}
//			}
//		}
//		
//		int [] arr1= new int[arr.length];
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>0) {
//			 arr1[i] = arr[i];
//			}
//		}
//		System.out.println("Unique number");
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>0) {
//				System.out.print(arr[i]+" ");
//			}
//		
//		}
//		
//	}
//	
//	
//	
//	
	
//===========================================================================
//	static int tripletsum(int[] arr, int target) {
//		int sum =0;
//		int n = arr.length;
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++ ) {
//				for(int k=j+1; k<arr.length; k++) {
//					if(arr[i] + arr[j] +arr[k] == target) {
//					sum++;
//				}
//			}
//		}
//	}
//		return sum;
//}
	
//===========================================================================
//	static int sum(int[] arr, int target) {
//		int ans =0;;
//		int n =arr.length;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//			if(arr[i]+ arr[j] == target) {
//				ans++;
//			
//				}
//			}
//		}
//		return ans;
//	}
//==========================================================================
	
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of arr");
		  int n = sc.nextInt();
	  int arr[] = new int[n];
	  
	  System.out.println("enter the element of arr");
	  for(int i=0; i<arr.length; i++) {
		  arr[i] = sc.nextInt();
	  }
	  
	  for(int i=0; i<arr.length; i++) {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	  
//	  System.out.println("enter the target");
//	  int target=sc.nextInt();
	  
	//  System.out.println("target sum pair is "+sum(arr, target));
	//System.out.println("target sum pair is "+tripletsum(arr, target));
	  //uniqueNum(arr);
//	  System.out.println(" it's unique num  "+uniqueNum(arr));
//			  for(int i=0;i<arr.length;i++) {
//				System.out.println(a[i]);
//			  }
	  System.out.println(max(arr));
	  System.out.println(secmax(arr));
	}

}
