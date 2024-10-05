package pass;
import java.util.*;

public class func {
public static void printfactorial(int n) {
	int factorial =1;
	for(int i=n; i<=1; i--) {
		factorial = factorial*1;
	}
	
	System.out.println(factorial);
	return;
}

public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	printfactorial(n);
}
}
