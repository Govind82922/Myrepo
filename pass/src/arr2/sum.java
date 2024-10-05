package arr2;

public class sum {
	
		static void matrix(int [][]arr) {
			int n = arr.length;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	
		static void sum(int[][] a, int r1, int c1, int[][] b, int r2, int c2 ) {
			if(r1!=r2 || c1!=c2) {
				System.out.println("wrong input");
				return;
			}
			
			int [][] sum = new int[r1][c1];
			for(int i=0; i<r1; i++) {
				for(int j =0; j<c1; j++) {
					sum [i][j]= a[i][j]+b[i][j];
				}
			}
			
			

}
		
		public static void main(String[] args) {
			matrix(arr);
		}
}