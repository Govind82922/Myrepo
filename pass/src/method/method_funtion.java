package method;

import java.util.Scanner;

public class method_funtion {
	
//	static int jor(int a, int b) {
//		int sum = a+b;
//		return sum;
//	}
	
//	static int gunna(int a, int b) {
//		int mul = a*b;
//		return mul;
//	}
	
	static int fact(int n) {
		if(n<0) {
			System.out.println("invalid number");
			return 0;
		}
		int factorial = 1;
		for(int i=n; i>=1; i--) {
			factorial = factorial*i; 
		}
		
		System.out.println(factorial);
		return factorial;
	}
	
	
public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter the n ");
		int n = sc.nextInt();
//		System.out.println("enter the b ");
//		int b = sc.nextInt();
		
//		int sum = jor(a, b);
//		System.out.println("sum of a+b "+sum);
		
//		int mul = gunna(a,b);
//		System.out.println("multiply of 2 number "+mul);
		//int factorial = fact(n);
		fact(n);
		
		
	}
}
