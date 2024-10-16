package pass;
import java.util.*;

public class search {
	
	static boolean search(int[]a, int n, int target,int idx) {
		// base case
		if(idx >= n) return false;
		
		// self work
		if(a[idx]==target) return true;
		
		// recursion work
		return search(a,n,target,idx+1);
			
		
	}

	
	static void Findallindices(int[]a,int n,int target,int idx) {
		// Base case
		if(idx >= n) {
			return;
		}
		
		// self case
		if(a[idx] == target) {
			System.out.println(idx);
		}
		
		// recursion work
		Findallindices(a,n,target,idx+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int []a = {1,2,4,8,9,8,8,3};
		int target=8;
//		if(search(a,target,0)) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
		
		/// find all indeces
		
		int n =a.length;
		Findallindices(a,n,target,0);
		
	}
       
}
