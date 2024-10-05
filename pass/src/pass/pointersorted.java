package pass;

import java.util.Scanner;
public class pointersorted {

   static void print(int [] arr) {
	Scanner sc = new Scanner(System.in);
//   System.out.println("enter the size");
//	int n = sc.nextInt();
    int [] ans = new int[n];
	System.out.println("print " + n +"element");
	for(int i=0; i<arr.length; i++) {
		arr[i]= sc.nextInt();
	}
}


	static int[] sortsquares(int [] arr) {
		int n = arr.length;
		int left = 0;
		int right = n-1;
		int [] are = new int[n];
		int k=0;
		
		while(left<=right) {
			if(Math.abs(arr[left]) > Math.abs (arr[right])){
			arr[k++] = arr[left] * arr[left];
			left++;
			}
			else {
				arr[k++] = arr[right];
				right--;
			}
		}
		
		return arr;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of arr");
		int m = sc.nextInt();	
		int [] arr = new int[m];
		
		print(arr);
	}

}
