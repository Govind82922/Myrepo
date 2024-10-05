package pass;

public class arr4 {
	
	static void printArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	static int[] reversearr(int [] arr) {
		int n = arr.length;
		int [] ans = new int[n];
		int j = 0;
		for(int i=n-1; i>=0; i-- ) {
			ans[j]=arr[i];
			j++;
	}
	return ans;
	}
	
//========================================================================	
//	static void swap(int a, int b ) {
//		System.out.println("without swap of element");
//		System.out.println(" a = "+a);
//		System.out.println(" b = "+b);
//
//		System.out.println("after the swap");
////		int a = 5;
////		int b = 6;
//		
//		a=a+b; // a = 11 
//		b=a-b; // b = 5
//		a=a-b; // a = 6
//		
//		System.out.println(" a = "+a);
//		System.out.println(" b = "+b);

//		return;
//	}
	
//=======================================================================	
//		System.out.println("without swap of element");
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
//		int temp = a;
//		a=b;
//		b=temp;
//		
//		System.out.println("after swaping the element");
//		System.out.println(" a = "+ a);
//		System.out.println(" b = "+b);
//		
//		
	

	public static void main(String args[]) {
		int a =5;
       int b= 6;
       int arr [] = {1,2,3,4,5,6};
       printArray(arr); // PRINT GIVEN ARR
       int ans[]=reversearr(arr);
       printArray(ans);  // IT'S CALL REVERSE ARR
//       for(int i=0;i<arr.length;i++) {
//    	   System.out.print(ans[i]+" ");
//       }
//       System.out.println();
	//	swap(a,b);
	}
}
