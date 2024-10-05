package arr2;
import java.util.*;

public class start {
	
	static void print(int[][] arr) {
		int n = arr.length;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("enter number of rows");
		int r = sc.nextInt();
		
		System.out.println("enter the column element");
		int c = sc.nextInt();
		
		int [][] arr = new int[r][c];
		
//		int [][] arr2 = {
//				{1,3,6},
//				{5,7,9},
//				{9,4,6}
//		};
		//print(arr2);
		
		System.out.println("enter "+ r*c +" element ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("their code run succefully");
		
		print(arr);
		
	}

}
