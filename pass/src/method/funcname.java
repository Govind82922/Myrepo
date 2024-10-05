package method;
import java.util.Scanner;

public class funcname {
	
//	public static void factorial(int n) {
//		int fact= 1;
//		for(int i=n; i>=1; i--) {
//			fact= fact*i;	
//			}
//		System.out.print(fact);
//		return;
//	}
//
//	public static void main(String args[]) {
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int fact = sc.nextInt();
//		factorial(fact);
//	}
	
	static void jor(int a, int b) {
		int sum = a+b;
		return;
	}
	
     public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("enter the no.of element");
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   
	   System.out.println("enter the arr of elemrnt");
	   for(int i=0; i<arr.length; i++) {
		   arr[i] = sc.nextInt();
	   }
	   for(int i=0; i<n; i++) {
	   System.out.print(arr[i]);
	   }
}	
 }