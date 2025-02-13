package fib;
import java.util.*;

public class Fibnocci {
//	public static void main(String args[] ) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number");
//	int n =sc.nextInt();
//	int count=0;
	
//		int n=10, a=0, b=1;
//		int c;
//		
//		for(int i=0;i<=n; i++) {
//			System.out.println((a)+" ");
//			c=a+b;
//			a=b;
//			b=c;
//		}
	
//	int a=0,b=1;
//	int c;
//	for(int i=0; i<=n; i++) {
//		System.out.println(a+" ");
//		c=a+b;
//		a=b;
//		b=c;
//	}
	//public class PrimeNumbers {
	    public static void main(String[] args) {
	        for (int number = 2; number <= 50; number++) {
	            boolean isPrime = true;
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.println(number);
	            }
	        }
	    }
	

	}
	
