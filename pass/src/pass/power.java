package pass;

public class power {
	
	static int pow(int p, int q) {
		if(q==0) return 1;
		int smallans = pow(p,q-1);
		return smallans*p;
	}
	
	
	public static void main(String[] args) {
	System.out.println(pow(2,4));	
	}

}
