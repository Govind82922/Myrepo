package pass;
import java.util.*;
public class average {
 public static int PrintAverage (int a, int b, int c) {
	 return (a+b+c)/3;
 }
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the first number");
	 int a = sc.nextInt();
	 System.out.println("enter the second number");
	 int b = sc. nextInt();
	 System.out.println("enter the second number");
	 int c = sc.nextInt();
	 int avg = PrintAverage(a,b,c);
	 System.out.println(avg);
 }
}
