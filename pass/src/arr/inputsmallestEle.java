package arr;
import java.util.*;
public class inputsmallestEle {
	    static int mini(int arr[]) {
	        int ans = Integer.MAX_VALUE; // Initialize to the maximum possible value
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            if (arr[i] < ans) { // Update if we find a smaller element
	                ans = arr[i];
	            }
	        }
	        return ans;
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of elements:");
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("The minimum element = " + mini(arr));
	        sc.close();
	    }
	}


