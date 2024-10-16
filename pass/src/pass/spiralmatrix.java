package pass;

import java.util.Scanner;

public class spiralmatrix {
	static void printmatrix(int [][] matrix) {
		for(int  i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void spiral(int [][]arr, int r, int c)
{
  int toprow=0, bottomrow=r-1, leftcol=0, rightcol=c-1;
  int totalelement =0;
  
  
    while(totalelement < r*c) {
	  // topRow-> leftcol to rightcol
    	for(int j=leftcol; j <= rightcol && totalelement < r*c; j++ ) {
    		System.out.println(arr[toprow][j]+" ");
    		totalelement++;
    	}
    	toprow++;
    	
    	// rightcol-> toprow to bottomrow
    	for(int i=toprow; i <= bottomrow && totalelement < r*c; i++) {
    		System.out.println(arr[i][rightcol]+" ");
    		totalelement++;
    	}
    	rightcol--;
    	
    	
    	// bottom row-> rightcol to leftcol
    	for(int j= rightcol; j>=leftcol && totalelement < r*c; j--) {
    		System.out.println(arr[bottomrow][j]+" ");
    		totalelement++;
  }
    	bottomrow--;
    	
    	
    	// leftcol -> bottomrow to toprow
    	for(int i=bottomrow; i>=toprow  && totalelement < r*c; i--) {
    		System.out.println(arr[i][leftcol]+" ");
    		totalelement++;
    	}
      leftcol++;	
}
	}	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter row and column number");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][] matrix = new int[r][c];
		int total = r*c; 
		System.out.println("enter "+ total+ " values");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("input the matrix");
		printmatrix(matrix);
		System.out.print("output of the spiral matrix");
		spiral(matrix,r,c);
	}
}