package op;
import java.util.Scanner;
public class tes {
	
	static int area(int a, int b) {
		int c = (a*b)*1/2;
		return c;
	}
	
	
	

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your number");
//		int n = sc.nextInt();
//		int sum=0;
//		for(int i=1; i<=10; i++) {
//			System.out.println(i*n);
//		}
//
//}
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the first number");
	   int a = sc.nextInt();
	   System.out.println("neter the second number ");
	   int b = sc.nextInt();
	  // int area = area(a,b);
	   System.out.println(area (a,b));
	
   }
	
}
