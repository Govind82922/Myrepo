package STRING;

public class pallindrom {
//	public static void main(String args[]) {
//		String str = "abcdcba";
//		int i=0;
//		int j = str.length()-1;
//		boolean flag = true;
//		while(i<j) {
//			if(str.charAt(i)!=str.charAt(j)) {
//				flag = false;
//				break;
//			}
//			i++;
//			j--;
//		}
//		if(flag==true) System.out.println("palindrome");
//		else System.out.println("not palindrone");
//	}
//}

//	public static void main(String args[]) {
//		String str = "abcdcba";
//		String scd = new StringBuilder(str).reverse().toString();
//		
//		if(str.equals(scd)) {
//			System.out.println("pallindrome");
//		}
//		else {
//			System.out.println("not pallindrome");
//		}
//	}
	
	public static boolean ispalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
   
	public static void main(String args[]) {
		String str = "abbd";
		int count =0;
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				if(ispalindrome(str.substring(i,j))==true) {
					System.out.println(str.substring(i,j)+" ");
					count++;
				}
			}
		}
		System.out.println("number sub string of palindrome "+count);
	} 
}
