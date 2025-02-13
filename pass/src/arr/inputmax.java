package arr;
import java.util.*;

  public class inputmax {
  static int maxi(int arr[]) {
	
	  int ans= 0;
	  int n = arr.length;
	  
	  for(int i=0; i<n; i++) {
		  if(arr[i] > ans) {
			  ans = arr[i];
		  }
	  }
	  return ans;
}
  
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter the number");
	  int n = sc.nextInt();
	  int arr[] = new int[n];
	  
	  System.out.println("enter the element");
	  for(int i =0; i<n; i++) {
		  arr[i] = sc.nextInt();
	  }
	  
	  System.out.println("the maxi = "+maxi(arr));
  }
	
}
