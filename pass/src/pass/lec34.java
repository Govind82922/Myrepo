package pass;
import java.util.*;

public class lec34 {
	
	static void mul(int n, int k) {
		if(k==1) {
			System.out.println(n);
			return;
		}
		
		mul(n,k-1); // except the last digit all digit are multiple
		
		System.out.println(n*k);
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("time of multiplier");
	int n = sc.nextInt();
	System.out.println("multiplier didgit");
	int k = sc.nextInt();
	System.out.println("answer// output");
	mul(k,n);
}
}
