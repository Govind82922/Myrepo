package pass;

import java.util.*;

public class j {
	
	static int firstRepectingNumber(int[] arr) {
		int n = arr.length;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
				return	arr[i];
				}
			}
		}
		
		return n;
	}


	
//	public static int SumOfTwoNumber(int a, int b) {
//		int sum = a+b;
//		return sum;
//	}
//	
//	
//	public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the first number");
//	int a = sc.nextInt();
//	System.out.println("enter the second number");
//	int b = sc.nextInt();
//	
//	int sum = SumOfTwoNumber(a,b);
//	System.out.println(" the sum of two number :"+sum);
//	
//	}
	
	
	
//	
//	public static int MulOfTwoNumber(int n, int m) {
//		return a*b;
//	}
//	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//	System.out.println("enter the first number");
//	int n = sc.nextInt();
//	System.out.println("enetr the second number");
//	int m = sc.nextInt();
//	
//	int mul = MulOfTwoNumber(a,b);
//	System.out.println(mul);
//	 
//	}
	
//	public static int addtwonumber(int a, int b) {
//		return a+b;
//	}
//	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the 1st number");
//		 int a = sc.nextInt();
//		 System.out.println("enter the 2nd number");
//		 int b = sc.nextInt();
//		 int add = addtwonumber(a,b);
//		 System.out.println(add);
//	}
	
//	public static void take2nummax(int a, int b) {
//		if(a==b) {
//			System.out.println("both are equal");
//			return;
//		}
//		
//		else if(a>b) {
//			System.out.println("a is greater than b");
//			return;
//		}
//		else {
//			System.out.println("b is greater than a");
//		}
//		
//	}
//	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter the first number");
//		int a = sc.nextInt();
//		System.out.println("enter the secnd number");
//		int b = sc.nextInt();
//		take2nummax(a,b);
//		
//	}
//	
//	public static void main(String srgs[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		double radius = sc.nextDouble();
//		double pi = 3.14;
//		double diameter = 2*radius;
//		double area = pi*radius *radius;
//		double cir = 2*pi*radius;
//		System.out.println(area);
//		System.out.println("diameter");
//		System.out.println(cir);
//	}
//	
	
//	static void printTheEligibility(int age) {
//		if(age < 18) {
//			System.out.println("not Eligible");
//			
//		}
//		
//		else {
//			System.out.println("eligible");
//		}
//	}
//		
//		public static void main(String args[]) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter the age");
//			int age = sc.nextInt();
//			printTheEligibility(age);
//				
//	}	
	
//	public static void infiniteloop(int x) {
//		System.out.println("enter the number");
//		do
//		{
//			System.out.println(x);
//			x++;
//		}while(x<100);
//	}
//	public static void main(String args[]) {
//		System.out.println(x);
//	}
	//=====================================================================
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the size of arr");
			int n = sc.nextInt();
		    int arr[] = new int[n];
		
		System.out.println("enter the element of arr");
		for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	
		System.out.println(firstRepectingNumber(arr));
	}
	
}