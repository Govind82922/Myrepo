package pass;

import java.util.Scanner;

public class fibnocci {
	
	static int fib(int n) {
	if(n==0 || n==1) {
		return n;
	}
	int pre = fib(n-1);
	int prepre = fib(n-2);
	int sub = pre+ prepre;
	return sub;
	}
	static int fact(int n) {
		if(n == 0) return 1;
		int second_last_digit= fact(n-1);
		
		int ans = n*second_last_digit;
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("fibnnaci");
		System.out.println(fib(n));
		System.out.println("factorial");
		System.out.println(fact(n));
	}
}
