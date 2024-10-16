package arr2;
import java.util.*;

public class sum {
	
		static void matrix(int [][]arr) {
			int n = arr.length;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	
		static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2 ) {
			if(r1!=r2 || c1!=c2) {
				System.out.println("wrong input");
				return;
			}
			
			int [][] sum1 = new int[r1][c1];
			for(int i=0; i<r1; i++) {
				for(int j =0; j<c1; j++) {
					sum1 [i][j]= a[i][j]+b[i][j];
				}
			}
			
			sum.matrix(sum1);  

       }
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("enter the elememt of row and column");
			int r1 = sc.nextInt();
			int c1 = sc.nextInt();
			System.out.println("Enter "+ r1*c1 +" Element");
			int arr[][] = new int[r1][c1];
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					arr[i][j]= sc.nextInt();
				}
			}
			
			
			System.out.println("enter the elememt of row and column");
			int r2 = sc.nextInt();
			int c2 = sc.nextInt();
			System.out.println("Enter "+ r1*c1 +" Element");
			int arr1[][] = new int[r2][c2];
			for(int i=0; i<r2; i++) {
				for(int j=0; j<c2; j++) {
					arr1[i][j]= sc.nextInt();
				}
			}
			
			
			sum.add(arr, r1, c1, arr1, r2, c2);	
	
		}
}