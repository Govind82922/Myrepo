package arr2;
import java.util.*;

public class passcalTriangle {
	
	
static void printmatrix(int [][] matrix) {
	for(int i=0; i<matrix.length; i++) {
		for(int j=1; j<matrix[i].length; j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
}

   static int[][] pass( int n) {
	   int [][] pass = new int[n][];
  	for(int i=0; i<n; i++) {
  		pass[i] = new int[i+1];
  		pass[i][0]=pass[i][i]=1;
  		for(int j=1; j<i; j++) {
  		pass[i][j]=pass[i-1][j]+pass[i-1][j-1];
  		}
  	}
  	return pass;
}
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter n");
	   int n =sc.nextInt();
	   int [][] aas = pass(n);
	   printmatrix(aas);
   }
}
