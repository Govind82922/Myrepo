package geeksofgeeks;

public class second {

	    // Method to find the missing element
	    static int findMissing(int[] arr, int n) {
	        int totalSum = n * (n + 1) / 2;
	        int arraySum = 0;
	        
	        for (int num : arr) {
	            arraySum += num;
	        }
	        
	        return totalSum - arraySum;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 5};
	        int n1 = 5;
	        System.out.println("Missing element in array 1: " + findMissing(arr1, n1));
	        
	        int[] arr2 = {1};
	        int n2 = 2;
	        System.out.println("Missing element in array 2: " + findMissing(arr2, n2));
	    }
	}


