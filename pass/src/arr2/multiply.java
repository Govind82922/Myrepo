package arr2;
import java.util.*;

public class multiply {
	
	static void matrix(int [][]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int[][] mul(int [][]a, int r1, int c1, int[][] b, int r2,int c2 )
	{
		int [][] mul1 = new int [r1][c2] ;
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				for(int k=0; k<c2; k++) {
				mul1[i][j] += a[i][k] * b[k][j];
			}
		}
	}
		System.out.println("multiplication of 2 matrix");
	    matrix(mul1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and column number");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		System.out.println("enter matrix 1 element");
		int arr[][] = new int[r1][c1];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("enter the 2 matrix row and column");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		System.out.println("enter matrix of 2 ");
		int arr1[][]= new int[r2][c2];
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix 1");
		matrix(a);
		System.out.println("matrix 2");
		matrix(arr1);
	}

}
