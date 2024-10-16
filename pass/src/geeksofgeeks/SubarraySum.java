package geeksofgeeks;


	public class SubarraySum {

	    // Method to find the subarray with the given sum
	    static int[] findSubarrayWithSum(int[] arr, int s) {
	        int n = arr.length;
	        int currentSum = 0;
	        int start = 0;
	        
	        for (int end = 0; end < n; end++) {
	            currentSum += arr[end];
	            
	            // Remove elements from the start if the current sum exceeds the target sum
	            while (currentSum > s && start < end) {
	                currentSum -= arr[start];
	                start++;
	            }
	            
	            // Check if the current sum matches the target sum
	            if (currentSum == s) {
	                return new int[]{start + 1, end + 1}; // 1-based index
	            }
	        }
	        
	        return new int[]{-1}; // Return -1 if no subarray is found
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 7, 5};
	        int s1 = 12;
	        System.out.println("Subarray with sum " + s1 + ": " + Arrays.toString(findSubarrayWithSum(arr1, s1)));
	        
	        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int s2 = 15;
	        System.out.println("Subarray with sum " + s2 + ": " + Arrays.toString(findSubarrayWithSum(arr2, s2)));
	        
	        int[] arr3 = {7, 2, 1};
	        int s3 = 2;
	        System.out.println("Subarray with sum " + s3 + ": " + Arrays.toString(findSubarrayWithSum(arr3, s3)));
	        
	        int[] arr4 = {5, 3, 4};
	        int s4 = 2;
	        System.out.println("Subarray with sum " + s4 + ": " + Arrays.toString(findSubarrayWithSum(arr4, s4)));
	    }
	}

}
