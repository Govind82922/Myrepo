package pass;
import java.util.Scanner;

public class recursion {

//	static void printIncrease(int n) {
//
//		if(1==n) {
//			System.out.println(n);
//			return;
//		}
//		printIncrease(n-1);
//		System.out.println(n);
//	}
	
	static void decreasing(int n) {
		if(1==n) {
			System.out.println(1);
			return;
		}
		
		System.out.println(n);
		decreasing(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		//printIncrease(n);
		decreasing(n);
	}
}
