package pass;
import java.util.*;

public class seriessum {
	
	static int series(int n) {
		
		if(n==0) return 0;
		// it's for the even number
		if(n%2==0) {
			return series(n-1) -n;
		}
		
		// it's for the odd number
		else {
			return series(n-1)+n;
		}
	}
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(series(n));
}
}
