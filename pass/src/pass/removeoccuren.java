package pass;
import java.util.*;

public class removeoccuren {
	static String removeA(String s, int idx ) {
		//base case
		if(idx == s.length()) return" ";
		
		//recursion case
		String smallAns = removeA(s,idx+1);
		
		char currchar = s.charAt(idx);
		//self case
		if(currchar!='a') {
			return currchar + smallAns;
		}else {
			return smallAns;
		}
	}
	
	
	static String removeA2(String s) {
		if(s.length()==0) return" ";
		String smallAns = removeA2(s.substring(1));
		char currchar = s.charAt(0);
		if(currchar != 'a') {
			return currchar +smallAns;
		}else {
			return smallAns;
		}
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(removeA(s,0));
	
}
}
