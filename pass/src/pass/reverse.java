package pass;
import java.util.*;

public class reverse {
	
	static String reverse(String s, int idx) {
		if(idx == s.length()) return " ";
		String samllAns = reverse(s,idx+1);
		return samllAns + s.charAt(idx);
	}
	
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String rev = reverse(s,0);
	//System.out.println(reverse(s,0));

	if(rev.equals(s)) {
		System.out.printf("%s palindrome",s);
	}else {
		System.out.printf("%s not palindrome",s);
	}
}
}
