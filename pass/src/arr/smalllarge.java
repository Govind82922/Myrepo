package arr;
import java.util.*;

public class smalllarge {
  static int[] smalllarge(int arr[]) {
	  Arrays.sort(arr);
	  int ans[] = {arr[0],arr[arr.length-1]};
	  return ans;
  }
  
  public static void main(String args[]) {
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("enter the size of arr");
		  int n = sc.nextInt();
	  int arr[] = new int[n];
	  
	  System.out.println("enter the element of arr");
	  for(int i=0; i<arr.length; i++) {
		  arr[i] = sc.nextInt();
	  }
	  
	  for(int i=0; i<arr.length; i++) {
		  System.out.println(arr[i]);
	  }
	  

	  int [] ans = smalllarge(arr);
	  System.out.println("smallest "+ans[0]);
	  System.out.println("largest "+ans[1]);
  }
  
}
