package pass;
import java.util.Scanner;

public class factorial {

	static int factorial(int n) {
		if(n==0) return 1;
		int smallAns = factorial(n-1);
		int ans = n*smallAns;
		return ans;
	}
	
//	static int fabb(int n) {
//		if(n==0 || n==1) return 1;
//		int b =  fabb(n-1);
//		int a = fabb(n-2);
//		int ans =a+b;
//		return ans;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println(factorial(n)  );
		//System.out.print(factorial.fabb(n));
	}
}
