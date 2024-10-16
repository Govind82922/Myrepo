package pass;
import java.util.*;

public class add {
	

	static int add(int n) {
		if(n==0) return 0;
	
	 return add(n-1) + n;
	}
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		System.out.println(add(n));
	}
}
