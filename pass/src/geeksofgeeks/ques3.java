package geeksofgeeks;

public class ques3 {
	    
	    // Method to find the maximum sum of all subarrays
	    static int maxSubArraySum(int[] arr) {
	        int maxSum = arr[0];
	        int currentSum = arr[0];
	        
	        for (int i = 1; i < arr.length; i++) {
	            currentSum = Math.max(arr[i], currentSum + arr[i]);
	            maxSum = Math.max(maxSum, currentSum);
	        }
	        
	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, -2, 5};
	        System.out.println("Maximum subarray sum: " + maxSubArraySum(arr1));  // Output: 9
	        
	        int[] arr2 = {-1, -2, -3, -4};
	        System.out.println("Maximum subarray sum: " + maxSubArraySum(arr2));  // Output: -1
	        
	        int[] arr3 = {5, 4, 7};
	        System.out.println("Maximum subarray sum: " + maxSubArraySum(arr3));  // Output: 16
	    }
	}


