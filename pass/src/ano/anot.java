package ano;
import java.util.*;
public class anot {
	
	static int pairSum(int []arr,int target) {
		int n = arr.length;
		int ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				if(arr[i] + arr[j] == target) {
					ans++;
				}
			}
		}
		return ans;
	}
	
	
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
//	int a;
//    System.out.print("enter the first number  ");
//	a = sc.nextInt();
//	
//	int b;
//	System.out.print ("enter the second number  ");
//	b = sc.nextInt();
//	
//	
//	System.out.println("The sum of two number :"+(a+b));
//	}
	
//		int n, sum =0;
//		System.out.println("enter the number");
//		n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			sum=sum+i;
//		}
//		
//		System.out.println(sum);
    
//      System.out.println("ENTER THE ARR");
//      int n = sc.nextInt();
//      int arr[] = new int [n];
//      
//      System.out.print("enter the "+n+ "element");
//      for(int i =0; i<=arr.length; i++) {
//    	  arr[i] = sc.nextInt();
//      }
//      
//      for(int i=0; i<=n; i++) {
//    	  System.out.print(arr[i]+"  ");
//      }
    
		System.out.println("enter the element number");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		
		System.out.println("enter the "+n+ "element");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();	
		}
		
		System.out.println("enter the target sum");
		int target = sc.nextInt();
		System.out.println(pairSum(arr,target));
    
    
}
}