package arr2;
import java.util.*;

public class transpose_arr {
	
	static void print(int [][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}

			System.out.println();
		}
	
	
	
}
	static int[][] transpose(int [][]a,int r, int c){
		int ans[][]= new int[c][r];
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				ans[i][j] = a[j][i];
			}
		}
		return ans;
	}
	
	
    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the number of row and  column");
	int r = sc.nextInt();
	int c = sc.nextInt();
	int [][] matrix = new int[c][r];
	int totalelement = r*c;
	System.out.println("total number of element "+totalelement+" ");
	for(int i=0; i<c; i++) {
		for(int j=0; j<r; j++) {
			matrix[i][j]= sc.nextInt();
		}
	}
	System.out.println("input matrix");
	print(matrix);
	
	
	System.out.println("transpose of matrix");
	int [][]ans = transpose(matrix, r,c);
	print(ans);
}
}
