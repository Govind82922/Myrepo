package pass;
import java.util.*;
public class array { 
	
	static void foundaar() {
		int []arr = {2,4,6,8,9,12,23}; 
			int x = 50;
			int ans = -1;
			
			for(int i=0; i < arr.length; i++) {
				if(arr[i]==x) {
					System.out.println(i);
					//ans =i;
					
				}
				
			}
//			if(ans == -1) {
//				System.out.println("not found");
//			}
//			else {
//				System.out.println("found");
//			}
//			
		
	
	
//	static void sumarrelmt() {
//		int []arr =  {10,2,56,4,6};
//		int sum=0;
//	for(int i=0; i<arr.length; i++) {
//		if(arr[i] > sum) {
//			sum = arr[i];
//		}
//		 
//	}
//	
//	  System.out.println(sum);
	
	
	// 2D array with function
	
//	static void multiarrays() {
//		int [][] arr1 = new int[5][3];
//		int [][]arr = {{56,43,6}, {34,7,8}, {12,56,8}};
//		
//		for(int i=0; i<3; i++) {
//			for( int j=0; j<3; j++) {
//			System.out.println(arr[i][j]);
//			}
//		}
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
//		
//		System.out.println(arr[2][0]);
//		System.out.println(arr[2][1]);
//		System.out.println(arr[2][2]);
		
	}
	
//	static void arraylenght() {
//		String[] name = {"rahul","shivam", "raj", "amit", "atul"};
//		int [] age = new int[3];
//		float[] weight = new float[23];
//		System.out.println(name.length);
//		System.out.println(age.length);
//		System.out.println(weight.length);
//		
//	}
	
	
  public static void main(String args[]) {
	//array  obj = new array();
	//multiarrays();
	//obj.arraylenght();
	//sumarrelmt();
	foundaar();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	int arry[]=new int[size];
	System.out.println("Enter Element");
	for(int i=0;i<size;i++) {
		arry[i]=sc.nextInt();
	}
	for(int i=0;i<arry.length;i++) {
		System.out.print(arry[i]+" ");
	}
	
}

}
