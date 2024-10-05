package arr2;

import java.util.Scanner;

public class mul2d {
	
	static void println(int [][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
			System.out.print(matrix[i]+" ");	
			}
			System.out.println();
		}
	}
	
	static void mul(int[][]a, int r1, int c1, int[][]b, int r2, int c2 )
	{
		int [][] mul = new int[r1][c2];
		for(int i=0; i<r1; i++){
			for(int j=0; j<c2; j++){
		       for(int k=0; k<c2; k++) {
			mul[i][j] += (a[k][i]*b[j][k]);
		}
			}
		}
		println(mul);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and column of matrix 1");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int [][] a = new int [r1][c1];
		System.out.println("enter matrix value");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the row and colum of matrix 2");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int [][] b = new int[r2][c2];
		
		System.out.println("enter matrix value 2");
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
			a[i][j]= sc.nextInt();	
				
			}
		}
		
		println(a);
		println(b);
		mul(a,r1,c1,b,r2,c2);
	}
}
