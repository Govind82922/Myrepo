package arr;

import java.util.Arrays;

public class secondlargestele {
 static int secondlarelement(int arr[]) {
	 int n = arr.length;
	 
	 Arrays.sort(arr);
	 
	 for(int i=n-2; i>=0; i--) {
		 if(arr[i]!=arr[n-1]) {
			 return arr[i];
		 }
	 }
	 return-1;
 }
 public static void main(String args[]) {
	 int arr[] = {14,12,13,11,16};
	// secondlarelement(arr);
	 System.out.println(secondlarelement(arr));
 }
}
